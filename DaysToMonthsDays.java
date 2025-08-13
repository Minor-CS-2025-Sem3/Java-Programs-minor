/*
12. Write a program to convert the given number of days into months & days using classes, objects and method.
(Assume 1 month = 30 days.)
*/
import java.util.Scanner;

class DayMonthConverter {
    int months;
    int days;
    void convert(int totalDays) {
        months = totalDays / 30;
        days = totalDays % 30;
    }
}

public class DaysToMonthsDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total days: ");
        int total = sc.nextInt();
        DayMonthConverter c = new DayMonthConverter();
        c.convert(total);
        System.out.println(total + " days = " + c.months + " month(s) and " + c.days + " day(s).");
        sc.close();
    }
}
