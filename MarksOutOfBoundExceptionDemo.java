/*
16. Define an exception called 'Marks out of Bound' exception that is thrown if entered marks are greater than 100.
*/
import java.util.Scanner;

// Custom exception
class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

public class MarksOutOfBoundExceptionDemo {
    public static void checkMarks(int marks) throws MarksOutOfBoundException {
        if (marks > 100) throw new MarksOutOfBoundException("Marks out of Bound (>100)!");
        if (marks < 0) throw new MarksOutOfBoundException("Marks cannot be negative!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();
        try {
            checkMarks(m);
            System.out.println("Marks accepted: " + m);
        } catch (MarksOutOfBoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
