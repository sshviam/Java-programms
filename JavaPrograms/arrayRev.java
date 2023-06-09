package JavaPrograms;
import java.util.Arrays;
public class arrayRev {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println("Original array: "+Arrays.toString(array));

        reverseArray(array);
        System.out.println("Reversed array: "+Arrays.toString(array));
    }

        public static void reverseArray(int[] array)
        {
            int start = 0;
            int end = array.length - 1;
        
            while (start < end)
            {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
    }
 