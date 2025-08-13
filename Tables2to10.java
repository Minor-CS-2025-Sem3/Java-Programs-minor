/*
4. Write a program to display tables from 2 to 10.
*/
public class Tables2to10 {
    public static void main(String[] args) {
        for (int n = 2; n <= 10; n++) {
            System.out.println("Table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
            System.out.println();
        }
    }
}
