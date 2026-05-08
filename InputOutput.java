import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args)  throws IOException {
        System.out.println("Enter a number:");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);

        // int num = Integer.parseInt(br.readLine());
        // System.out.println("You entered: " + num);


        // Using Scanner class
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);
        
    }
}
