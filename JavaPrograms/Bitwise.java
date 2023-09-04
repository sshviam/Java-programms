import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;

        System.out.println("a&b = "+ (a & b)); //bitwise and
        System.out.println("a|b = "+(a | b));  //bitwise or
        System.out.println("a^b = "+(a ^ b));  //bitwise xor
        System.out.println("~a = "+ ~a);       //bitwise not
        a &= b;
        System.out.println("a= "+a);

        //DIFFERNET ONE

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second no: ");
        int num2 = sc.nextInt();

        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Bitwise NOT: " + (~num1));
        System.out.println("Bitwise Left Shift: " + (num1 << 2));
        System.out.println("Bitwise Right Shift: " + (num1 >> 2));
        System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2));

        sc.close();
    }
}

