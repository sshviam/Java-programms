package JavaPrograms;
import java.util.Scanner;
public class sample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by spaces: ");
        String input = sc.nextLine();

        String[] numbers = input.split(" ");
        int first = Integer.parseInt(numbers[0]);
        int last = Integer.parseInt(numbers[numbers.length - 1]);

        System.out.println("First number: " + first);
        System.out.println("Last number: " + last);
        sc.close();
    }
}
