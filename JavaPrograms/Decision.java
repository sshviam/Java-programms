import java.util.Scanner;
public class Decision {
    void display()
    {
        System.out.println("Hello its's me");
    }
    void addition(int x , int y)
    {
        int  sum = x + y;
        System.out.println("addition of Two numbers :"+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Decision obj = new Decision();
        obj.display();
        //obj.addition(23, 77);
        System.out.println("Enter first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number ");
        int num2 = sc.nextInt();
        obj.addition(num1,num2);
        sc.close();

    }
    
}
