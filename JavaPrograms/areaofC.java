import java.util.Scanner;
public class areaofC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = 0;
        System.out.println("Enter area of circle :");
        radius = sc.nextInt();
        double area = 3.14*radius*radius;
        System.out.println("area of cirlc is "+area);
        sc.close();
    }
    
}
