/*
22. Write a Java Program to read data from the inputted text file name.
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFileByName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name (with path if needed): ");
        String filename = sc.nextLine();
        try {
            Scanner fs = new Scanner(new File(filename));
            System.out.println("File Contents:");
            while (fs.hasNextLine()) {
                System.out.println(fs.nextLine());
            }
            fs.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        sc.close();
    }
}
