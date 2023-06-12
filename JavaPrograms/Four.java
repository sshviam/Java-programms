package JavaPrograms;
import java.util.Arrays;

public class Four {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int elementToInsert = 12;
        int position = 2;

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] newArray = insertElement(array, elementToInsert, position);

        System.out.println("Array after inserting element " + elementToInsert + " at position " + position + ": " + Arrays.toString(newArray));
    }

    public static int[] insertElement(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];

        // Copy elements before the insertion position
        System.arraycopy(array, 0, newArray, 0, position);

        // Insert the element at the specified position
        newArray[position] = element;

        // Copy elements after the insertion position
        System.arraycopy(array, position, newArray, position + 1, array.length - position);

        return newArray;
    }
}

