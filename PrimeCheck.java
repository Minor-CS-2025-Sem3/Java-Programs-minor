/*
3. Write a program to check if a number is prime or not.
*/
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = n > 1;
        for (int i = 2; i * i <= n && isPrime; i++) {
            if (n % i == 0) isPrime = false;
        }
        if (isPrime) System.out.println(n + " is a prime number.");
        else System.out.println(n + " is not a prime number.");
        sc.close();
    }
}
