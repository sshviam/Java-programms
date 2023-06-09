package JavaPrograms;
import java.util.Scanner;
public class leapyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        if (isLeapYear(year))
        {
            System.out.println(year+" is a leap year.");
        }
        else 
        {
            System.out.println(year+" is not a leap year.");
        }
    }
    public static boolean isLeapYear(int year)
    {
        if (year % 4 !=0){
            return false;
        } else if (year % 100 !=0){
            return true;
        } else {
            return false;
        }
    }
}
