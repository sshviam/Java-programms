package JavaPrograms;
import java.util.Scanner;
class Palindrome {
    void palindroe(int num)
    {
        int temp = num;
        int rem = 0;
        int rev = 0;
        while(num>=0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
            if (temp==rev) {
                System.out.println("number is plaindrome");
            } else {
                System.out.println("number is not plaindrome");
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number is :");
        int x = sc.nextInt();
        Palindrome obj = new Palindrome();
        obj.palindroe(x);
        sc.close();
    }
}




