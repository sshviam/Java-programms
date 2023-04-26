package JavaPrograms;
import java.util.Scanner;
public class Addition{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
System.out.println("Enter value of a :");
int a = in.nextInt();
System.out.println("Enter value of b :");
int b = in.nextInt();
int sum = a + b;
System.out.println("Answer of 2 is :"+sum);  
in.close();     
    }
}
