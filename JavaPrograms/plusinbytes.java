package JavaPrograms;
import java.util.Scanner;
public class plusinbytes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the input from the user
        System.out.print("Enter a series of digits: ");
        String input = sc.nextLine();
        
        // Convert the input string to bytes
        byte[] bytes = input.getBytes();
        
        // Perform addition of the bytes
        int sum = 0;
        for (byte b : bytes) {
            sum += b;
        }
        
        // Print the result
        System.out.println("Sum of the bytes: " + sum);
        
        sc.close();
    }
}

