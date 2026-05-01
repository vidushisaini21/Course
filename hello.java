
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        char c = 'A';
        c++;
        System.out.println(c);

        byte b = 127;
        int a = b;
        byte d = (byte) a;
        System.out.println(d);

        // casting = explicitly converting a value from one data type to another. In Java, this is done using parentheses and the target data type. For example, if you have an int variable and you want to convert it to a byte

        // Basic arthmetic operators: +, -, *, /, %
        int x = 10;
        int y = 5;
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int quotient = x / y;
        int remainder = x % y;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
    }
}
