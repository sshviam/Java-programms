package JavaPrograms;
import java.util.Scanner;
public class One {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array: ");
       int size = sc.nextInt();
       
       int[] array = new int [size];

       System.out.println("Enter the elements of the array: ");
       for(int i = 0; i< size; i++)
       {
        array[i] = sc.nextInt();
       }
       System.out.println("Enter the element to fine its index: ");
       int target = sc.nextInt();
       int index = findIndex(array,target);
       if(index != -1)
       {
        System.out.println("The element"+target +"is found at index"+index);
       }
       else{
        System.out.println("The element"+target +"is not found in the array");
       }
       sc.close();
    }
    public static int findIndex(int[] array, int target)
    {
        for (int i = 0; i< array.length; i++)
        {
            if(array[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
