package JavaPrograms;

import java.util.Scanner;

public class additioninbytes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int x = sc.nextInt();

        int add = 0;
        int res = 0;
        while(x>0);
        {
            res =x%10;
            x/= 10;
            add =+ res;
        }
        System.out.println("Answer is here = "+add);
        sc.close();
    }
}
