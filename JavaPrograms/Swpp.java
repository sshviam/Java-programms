import java.util.Scanner;

public class Swpp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double feet = scanner.nextDouble();

        double meters = feetToMeters(feet);
        System.out.println(feet + " feet is equal to " + meters + " meters");

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");

        printDataTypesSize();

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int asciiValue = (int) character;
        System.out.println("ASCII value of '" + character + "' is " + asciiValue);

        System.out.print("Enter the radius of a circle: ");
        double radius = scanner.nextDouble();
        double circleArea = calculateCircleArea(radius);
        System.out.println("Area of the circle with radius " + radius + " is " + circleArea);

        System.out.print("Enter the side of a square: ");
        double side = scanner.nextDouble();
        double squareArea = calculateSquareArea(side);
        System.out.println("Area of the square with side " + side + " is " + squareArea);

        System.out.print("Enter the length and breadth of a rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double rectangleArea = calculateRectangleArea(length, breadth);
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is " + rectangleArea);

        System.out.print("Enter 'circle', 'square', or 'rectangle' to calculate area: ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("circle")) {
            System.out.println("Area of the circle: " + circleArea);
        } else if (choice.equalsIgnoreCase("square")) {
            System.out.println("Area of the square: " + squareArea);
        } else if (choice.equalsIgnoreCase("rectangle")) {
            System.out.println("Area of the rectangle: " + rectangleArea);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void printDataTypesSize() {
        System.out.println("Size of data types:");
        System.out.println("byte: " + Byte.SIZE / 8 + " bytes");
        System.out.println("short: " + Short.SIZE / 8 + " bytes");
        System.out.println("int: " + Integer.SIZE / 8 + " bytes");
        System.out.println("long: " + Long.SIZE / 8 + " bytes");
        System.out.println("float: " + Float.SIZE / 8 + " bytes");
        System.out.println("double: " + Double.SIZE / 8 + " bytes");
        System.out.println("char: " + Character.SIZE / 8 + " bytes");
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateSquareArea(double side) {
        return Math.pow(side, 2);
    }

    public static double calculateRectangleArea(double length, double breadth) {
        return length * breadth;
    }
}

