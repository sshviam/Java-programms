import java.util.Scanner;
public class pow {
    public static void main(String[] args) {
        double rem = 0;
        double arms = 0;
        Scanner sc = new Scanner(System.in);
        double num = 0;
        System.out.println("Enter the number :");
        num = sc.nextDouble();
        double temp = num;
        while (num > 0)
        {
            rem = num % 10;
            arms = arms + Math.pow(rem, 3);
            num = num / 10;
        }
        if (temp == arms)
        {
            System.out.println("Number is armstron");
        } else {
            System.out.println("Not armstrong");
        }
        sc.close();
    }
}
