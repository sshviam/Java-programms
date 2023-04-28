package JavaPrograms;
import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num1 = sc.nextInt();
        System.out.println("Enter number :");
        int num2 = sc.nextInt();
        int sum = num1 * num2;
        System.out.println("The multiply of 2 no.10 is :"+ sum);
        sc.close();
    }
}
