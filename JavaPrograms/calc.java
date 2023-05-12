package JavaPrograms;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number :");
        float num2 = sc.nextFloat();
        System.out.println("What operation you want to use (+, -, *, /): ");
        char ch = sc.next().charAt(0);
        double sum = 0.0;
        switch(ch){
            case '+':
            sum = num1 + num2;
            break;
            case '-':
            sum = num1 - num2;
            break;
            case '*':
            sum = num1 * num2;
            break;
            case '/':
            sum = num1 / num2;
            break;
            default:
            System.out.println("Invalid operation");
            return;
        }
        System.out.println("sum = "+sum);
    }
}
