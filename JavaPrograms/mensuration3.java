import java.util.Scanner;

public class mensuration3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter area1: ");
        double length = sc.nextDouble();

        System.out.println("Enter area2: ");
        double width = sc.nextDouble();

        System.out.println("Enter ares3: ");
        double height = sc.nextDouble();

        // double diagonallength = Math.sqrt(length * length + width * width + height * height);
       // System.out.println("Diagonal length of cuboid: "+diagonallength);

        // double volume = Math.sqrt(area1 * area2 * area3);
        // System.out.println("volume of cuboid: "+volume);

        // double totalSurfaceArea = Math.pow((length + width + height), 2) - Math.pow(CalculateDiagonal(length, width, height), 2);
        // System.out.println("Total Surface Area of the cuboid: " + totalSurfaceArea);



        sc.close();
    }
    // private static double CalculateDiagonal(double length, double width, double height) {
    //     return Math.sqrt(length * length + width * width + height * height);
    //}
}
