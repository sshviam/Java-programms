package JavaPrograms;
import java.util.Scanner;
public class swapp {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a :");
    int a = sc.nextInt();
    System.out.println("Enter value of b :");
    int b = sc.nextInt();
    System.out.println("Enter value of c :");
    int c = sc.nextInt();
    a = a + b;
    a = b - a;
    b = b - a;
    System.out.println("Value of a is :"+a);
    System.out.println("Value of b is :"+b);
    sc.close();
}
}
