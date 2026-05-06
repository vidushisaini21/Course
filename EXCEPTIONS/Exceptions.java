// exceptions try catch finally throw throws

package EXCEPTIONS;
public class Exceptions {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }

        // Example of throw and throws
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // example of multiple catch blocks
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }

        // example of nested try-catch
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
            try {
                String str = null;
                System.out.println(str.length()); // This will throw NullPointerException
            } catch (NullPointerException ex) {
                System.out.println("Caught a NullPointerException in nested try: " + ex.getMessage());
            }
        }
    }

    // Example of throw and throws
    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
    // Example of throws
    public static void riskyMethod() throws Exception {
        throw new Exception("Something went wrong in riskyMethod.");
    }
}
