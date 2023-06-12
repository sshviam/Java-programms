package JavaPrograms;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender :");
        String str=sc.next();
        String str2=str.toLowerCase();
        int per=0;

        if(str.equals("male"))
        {
            System.out.println("Enter your age :");
            int age=sc.nextInt();

            if(age<=26)
            {
                per=26;
            }
            else
            {
                per=9;
            }
        }

        else if(str2.equals("female"))
        {
            System.out.println("Do you play sports (yes/no) :");
            String sport=sc.next();
            String sport2=sport.toLowerCase();

            if(sport2=="yes")
            {
                per=21;
            }
            else
            {
                per=10;
            }
        }
        else
        {
            System.out.println("Enter your answer :");
        }
        System.out.println("Enter your product price :");
        int price=sc.nextInt();

        int dis=(price*per)/100;
        int finalp=price-dis;
        System.out.println("your deducted price is :"+finalp);
        sc.close();
    }
}
