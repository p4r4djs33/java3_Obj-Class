import java.util.Scanner;

/**
 * Rectangle
 */
public class rectangle {
    double width, height;

    public rectangle() {

    }

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        System.out.println();
        return this.width * this.height;
    }

    public double getPerimeter() {
        System.out.println();
        return (this.width + this.height) * 2;
    }

    public void display() {
        System.out.println("Rectangle{" + " width: " + width + " & height " + height + " }");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        rectangle rec1 = new rectangle(width, height);
        rec1.display();
        System.out.println("Perimeter of the Rectangle: " + rec1.getPerimeter());
        System.out.println("Area of the Rectangle: " + rec1.getArea());

    }
}