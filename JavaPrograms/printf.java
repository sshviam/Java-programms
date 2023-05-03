package JavaPrograms;
import java.util.Scanner;

import programms.logicalOP;
public class printf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String name = "Shivam";
        //int age = 19;
        //String course = "Java";
        //String city = "Vadodara";
        //String state = "Gujarat";
        //System.out.printf("Name: %s\nAge: %d\nCourse: %s\nCity: %s\nState: %s",name,age,course,city,state);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter course");
        String course=sc.next();
        System.out.println("Enter city");
        String city=sc.next();
        System.out.println("Enter state");
        String state=sc.next();
        System.out.printf("Name: %s\nAge: %d\nCourse: %s\nCity: %s\nState: %s",name,age,course,city,state);
        sc.close();
    }
}
