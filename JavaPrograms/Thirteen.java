package JavaPrograms;

public class Thirteen {
     public static void main(String[] args) {
        int[] array = {5, 10, 15, 8, 25, 3};

        int secondSmallest = findSecondSmallest(array);

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Second Smallest Element: " + secondSmallest);
    }

    public static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array size must be at least 2.");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Find the smallest element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Find the second smallest element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > smallest && array[i] < secondSmallest) {
                secondSmallest = array[i];
            }
        }

        return secondSmallest;
    }
}
