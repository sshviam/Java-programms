package JavaPrograms;
import java.util.Scanner;
public class additionscons {
    int num1;
    int num2;
    int num3;
    int sum;

    public additionscons(int n1, int n2, int n3)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
        sum = num1 + num2;
        sum = num3 - num2;
    }
    public int getSum()
    {
        return sum;
    }
    public static void main(String[] args) {
        additionscons addition = new additionscons(20, 10, 50);
        System.out.println("sum of "+addition.num1+" and "+addition.num2+" is "+addition.num3+" ,sum of num3 and num2 "+addition.getSum());
    }
}
