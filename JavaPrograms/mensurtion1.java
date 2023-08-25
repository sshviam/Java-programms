import java.util.Scanner;

public class mensurtion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length :");
        double length = sc.nextDouble();

        System.out.println("Enter width :");
        double width = sc.nextDouble();

        System.out.println("Enter height :");
        double height = sc.nextDouble();

        double perimeterofbase = 2 * (length + width);
        double lateralsurfacearea = perimeterofbase * height;

        System.out.print("lateral surface area of cuboid: "+lateralsurfacearea);
        
        sc.close();
    }
}
