/*
11. Write a program to calculate the salary of an employee if salary is >= 20000 and year of service >= 5 then bonus is 2000 otherwise 1000 and print gross salary.
*/
import java.util.Scanner;

public class EmployeeGrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        double bonus = (salary >= 20000 && years >= 5) ? 2000 : 1000;
        double gross = salary + bonus;
        System.out.println("Bonus = " + bonus);
        System.out.println("Gross Salary = " + gross);
        sc.close();
    }
}
