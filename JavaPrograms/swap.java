import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter another piece of information: ");
        String info = scanner.nextLine();

        printUserInput(name, info);

        scanner.close();
    }

    public static void printUserInput(String name, String info) {
        System.out.println("Name: " + name);
        System.out.println("Additional information: " + info);
    }
}
