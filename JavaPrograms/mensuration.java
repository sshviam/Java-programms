import java.util.Scanner;

public class mensuration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length :");
        double length = sc.nextDouble();

        System.out.println("Enter width :");
        double width = sc.nextDouble();

        System.out.println("Enter height :");
        double height = sc.nextDouble();

        double volume = length*width*height;

        System.out.println("Volume of cubiod is :"+volume);
        sc.close();
    }
}
