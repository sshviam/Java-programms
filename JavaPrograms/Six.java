package JavaPrograms;

import java.util.Arrays;

public class Six{
     public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};

        System.out.println("Original Array: " + Arrays.toString(array));

        reverseArray(array);

        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move start index towards the end
            start++;

            // Move end index towards the start
            end--;
        }
    }
}
