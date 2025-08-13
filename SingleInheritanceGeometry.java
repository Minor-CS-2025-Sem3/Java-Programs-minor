/*
17. Write a program using application of single inheritance. Find the area of rectangle & volume of cube.
*/
import java.util.Scanner;

class Rectangle {
    protected double length, breadth;
    Rectangle(double l, double b) { length = l; breadth = b; }
    double area() { return length * breadth; }
}

class Cube extends Rectangle {
    private double side;
    Cube(double s) {
        super(s, s); // use rectangle with l=b=side (base class fields not used for volume)
        side = s;
    }
    double volume() { return side * side * side; }
}

public class SingleInheritanceGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(l, b);
        System.out.println("Area of rectangle = " + r.area());

        System.out.print("Enter side of cube: ");
        double s = sc.nextDouble();
        Cube c = new Cube(s);
        System.out.println("Volume of cube = " + c.volume());
        sc.close();
    }
}
