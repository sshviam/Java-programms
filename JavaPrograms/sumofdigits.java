package JavaPrograms;
import java.util.Scanner;
public class sumofdigits {
    void sumofNumbers(int num)
    {
        int sum = 0;
        int rem = 0;
        while(num>0)
        {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println("Number is :"+ sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number is :");
        int x = sc.nextInt();
        sumofdigits obj = new sumofdigits();
        obj.sumofNumbers(x);
        sc.close();
    }
    }
