import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        int rev =0;
        int rem =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int temp = num;
        while(num > 0)
        {
            rem = num % 10;
            rev = rev * 10 + num;
            num = num / 10;
        }
        if (temp == rev)
        {
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
        sc.close();
    }
}
