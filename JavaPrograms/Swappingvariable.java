package JavaPrograms;
import java.util.Scanner;
public class Swappingvariable {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a :");
        int a = sc.nextInt();
        System.out.println("Enter number b :");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("the value of a :"+a);
        System.out.println("the value of b :"+b);
        sc.close();
    }
}
