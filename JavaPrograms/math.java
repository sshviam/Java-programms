import java.util.Scanner;

public class math {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle :");
    double radius_of_circle = sc.nextDouble();

    // double res = Math.acos(radius_of_circle);
    // System.out.println(res);

    // double res = Math.sqrt(radius_of_circle);
    // System.out.println(res);

    // double res = Math.cbrt(radius_of_circle);
    // System.out.println(res);

    // double res = Math.floor(radius_of_circle);
    // System.out.println(res);

    // double res = Math.toDegrees(radius_of_circle);
    // System.out.println(res);

    // double res = Math.abs(radius_of_circle);
    // System.out.println(res);

    // double res = Math.cosh(radius_of_circle);
    // System.out.println(res);

    // double res = Math.max(56, 65);
    // System.out.println(res);

    // double res = Math.nextDown(radius_of_circle);
    // System.out.println(res);

    // double res = Math.ulp(radius_of_circle);
    // System.out.println(res);

    // double res = Math.acos(radius_of_circle);
    // System.out.println(res);

    double res = Math.cos(radius_of_circle);
    System.out.println(res);

    sc.close();
}
}