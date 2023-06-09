package JavaPrograms;
import java.util.ArrayList;
import java.util.List;
public class listnoprimenodd {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int number =1; number <=100; number++)
        {
            if (isPrime(number))
            {
                primeNumbers.add(number);
            }
            if (isOdd(number))
            {
                oddNumbers.add(number);
            }
        }
        System.out.println("Prime numbers between 1 to 100: ");
        for (int number : primeNumbers)
        {
            System.out.println(number + " ");
        }
        System.out.println("\nOdd numbers between 1 to 100: ");
        for (int number : oddNumbers);
        {
            System.out.print(number +" ");
        }
    }
    public static void boolean isPrime(int number)
    {
        if (number < 2)
        {
            return false;
        }
        for (int i =2; i <= number / 2; i++);
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isOdd(int number)
    {
        return number % 2 !=0;
    }
}
