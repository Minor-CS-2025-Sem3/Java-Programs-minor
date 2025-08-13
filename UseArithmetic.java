/*
14. Create a package called 'Arithmetic' that contains methods to deal all arithmetic operations. Also write a program to use the package.
This is the program that uses the package.
*/
import arithmetic.Operations;
import java.util.Scanner;

public class UseArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Add = " + Operations.add(a, b));
        System.out.println("Sub = " + Operations.sub(a, b));
        System.out.println("Mul = " + Operations.mul(a, b));
        System.out.println("Div = " + Operations.div(a, b));
        sc.close();
    }
}
