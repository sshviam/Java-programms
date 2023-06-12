package JavaPrograms;
import java.util.Arrays;
public class Three {
    public static void main(String[] args) {
        int[] originalArray = {5,6,2,1,9};
        int[] sortedArray = copyAndSortArray(originalArray);
        System.out.println("Original Array: "+Arrays.toString(originalArray));
        System.out.println("Sorted Array: "+Arrays.toString(sortedArray));
    }
    public static int[] copyAndSortArray(int[] array){
        int[] newArray = Arrays.copyOf(array, array.length);
        Arrays.sort(newArray);
        return newArray;
    }
}
