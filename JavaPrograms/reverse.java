
import java.util.Scanner;
public class reverse {
    void reverseNumber(int num)
    {
        int rem=0;
        int rev=0;
        while(num>0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse of number is :"+rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int x = sc.nextInt();
        reverse obj = new reverse();
        obj.reverseNumber(x);
        sc.close();
    }
}
