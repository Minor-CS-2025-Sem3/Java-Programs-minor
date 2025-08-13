/*
2. Find the factorial of number if number is given by user using command line argument.
*/
public class FactorialCLI {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java FactorialCLI <non-negative integer>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
