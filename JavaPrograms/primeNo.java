package JavaPrograms;
import java.util.Scanner;
public class primeNo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number");
      int number = sc.nextInt();
      sc.close();

      boolean isPrime = isPrimeNumber(number);

      if (isPrime)
      {
        System.out.println(number+" is a prime numner");
      }
      else
      {
        System.out.println(number+" is not a prime number");
      }
    }
    private static boolean isPrimeNumber(int number)
    {
        if (number <= 1)
        {
            return false;
        }
        for (int i = 2; i <= number / 2; i++){
            if (number % i== 0){
                return false;
            }
        }
        return true;
    }
}
