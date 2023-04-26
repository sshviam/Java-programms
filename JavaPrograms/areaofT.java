package JavaPrograms;
import java.util.Scanner;
public class areaofT {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float base;
        float height;
        System.out.println("Enter the length of height");
        base = sc.nextFloat();
        height = sc.nextFloat();
        double Area = (base * height) / 0.5;
        System.out.println("Area of triangle is " +Area);
        sc.close();
}
} 
