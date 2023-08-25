import java.util.Scanner;

public class mensuration2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        double length = sc.nextDouble();

        System.out.println("Enter width: ");
        double width = sc.nextDouble();

        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        double perimeterofbase = 2 * (length + width);
        double lateralsurfacearea = perimeterofbase * height;

        double areaofbase = 2 * (length * width * width * height * height * length);
        double totalareasurface = lateralsurfacearea + areaofbase;

        System.out.println("total surface area of the cuboid: "+totalareasurface);

        sc.close();
    }
}
