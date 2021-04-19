import java.sql.Time;

import baitap.main;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
        this.startTime = System.currentTimeMillis(); //tính thời gian theo milisecond
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        StopWatch sW = new StopWatch();
        int n = 100000;
        int[] arr = new int[n];
        sW.start();
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        sW.stop();
        System.out.println("Total time is: " + sW.getElapsedTime());
    }
}