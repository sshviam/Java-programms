package JavaPrograms;
import java.util.Scanner;
public class Palind {
    void find(int num)
    {
        int temp = num;
        int rem = 0;
        int rev = 0;
        while(num>0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp==rev) 
        {
            System.out.println("number is plaindrome");
         } else 
         {
                System.out.println("number is not plaindrome");
           
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number is :");
        int x = sc.nextInt();
        Palind obj = new Palind();
        obj.find(x);
        sc.close();
    }
    
}
