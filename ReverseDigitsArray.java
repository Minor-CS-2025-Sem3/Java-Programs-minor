/*
8. Write a program to display reverse of a digit number using array.
*/
import java.util.Scanner;

public class ReverseDigitsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String s = sc.next();
        char[] digits = s.toCharArray();
        System.out.print("Reversed number: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
        sc.close();
    }
}
