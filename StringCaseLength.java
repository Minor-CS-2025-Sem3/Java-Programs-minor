/*
13. Write a program to convert given string into Uppercase and lowercase and get the length of string using array.
*/
import java.util.Scanner;

public class StringCaseLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        // length using char array
        char[] arr = s.toCharArray();
        int len = 0;
        for (char ch : arr) len++;
        System.out.println("Length (using array): " + len);
        sc.close();
    }
}
