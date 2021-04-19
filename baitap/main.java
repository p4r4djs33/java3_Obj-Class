package baitap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic Equation: ax^2 + bx + c = 0");
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation qe1 = new QuadraticEquation(a, b, c);
        if (qe1.getDelta() < 0){
            System.out.println("The equation has no roots");
        } else if (qe1.getDelta() == 0){
            System.out.println("The result is: " + qe1.getRoot1());
        } else {
            System.out.println("The result 1 is: " + qe1.getRoot1());
            System.out.println("The result 2 is: " + qe1.getRoot2());
        }
    }
}
