/*
1. Find greater number between two numbers - using conditional operator.
*/
import java.util.Scanner;

public class GreaterOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int greater = (a > b) ? a : b; // conditional operator
        System.out.println("Greater number = " + greater);
        sc.close();
    }
}
