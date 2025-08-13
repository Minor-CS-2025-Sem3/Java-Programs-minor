/*
19. Write a program using multiple inheritance to calculate area and perimeter of a circle using interface.
*/
import java.util.Scanner;

interface Area {
    double area(double r);
}

interface Perimeter {
    double perimeter(double r);
}

class CircleCalc implements Area, Perimeter {
    public double area(double r) { return Math.PI * r * r; }
    public double perimeter(double r) { return 2 * Math.PI * r; }
}

public class CircleWithInterfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        CircleCalc c = new CircleCalc();
        System.out.println("Area = " + c.area(r));
        System.out.println("Perimeter = " + c.perimeter(r));
        sc.close();
    }
}
