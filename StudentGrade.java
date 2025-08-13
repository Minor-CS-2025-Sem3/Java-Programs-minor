/*
10. Write a program to display grade according to the marks obtained by the student.
*/
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int m = sc.nextInt();
        String grade;
        if (m >= 90) grade = "A";
        else if (m >= 75) grade = "B";
        else if (m >= 60) grade = "C";
        else if (m >= 40) grade = "D";
        else grade = "F";
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
