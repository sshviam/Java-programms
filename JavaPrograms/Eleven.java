package JavaPrograms;

import java.util.Arrays;

public class Eleven {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 10, 20, 5, 25, 30, 20};

        int[] newArray = removeDuplicates(array);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));
    }

    public static int[] removeDuplicates(int[] array) {
        // Create a new array with the same length as the original array
        int[] newArray = new int[array.length];

        // Initialize the index for the new array
        int newIndex = 0;

        // Iterate through the original array
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element is a duplicate
            for (int j = 0; j < newIndex; j++) {
                if (array[i] == newArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the current element is not a duplicate, add it to the new array
            if (!isDuplicate) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }

        // Create a final array with the correct size
        int[] finalArray = new int[newIndex];
        System.arraycopy(newArray, 0, finalArray, 0, newIndex);

        return finalArray;
    }
}
