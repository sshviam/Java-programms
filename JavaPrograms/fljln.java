package JavaPrograms;
import java.util.ArrayList;
import java.util.List;

public class fljln {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }

        System.out.println("Prime numbers between 1 and 100: ");
        for (int number : primeNumbers) {
            System.out.print(number + " ");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
