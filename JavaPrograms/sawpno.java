import java.util.Scanner;
public class sawpno {
    void swapnumbers(int x,int y)
    {
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println("Swapped valriable are: "+x+" "+y);
    }
    public static void main(String[] args) {
        sawpno n = new sawpno();
        //n.swapnumbers(34, 56);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter x:");
        int x = sc.nextInt();

        System.out.println("Enter y:");
        int y = sc.nextInt();

        n.swapnumbers(x, y);
        sc.close();
    }
}
