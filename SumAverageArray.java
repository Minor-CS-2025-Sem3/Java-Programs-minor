/*
7. Write a Program to find sum & average of 10 numbers using arrays.
*/
import java.util.Scanner;

public class SumAverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = sum / 10.0;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        sc.close();
    }
}
