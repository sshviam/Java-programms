package JavaPrograms;

public class Twelve {
     public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};

        int secondLargest = findSecondLargest(array);

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Second Largest Element: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array size must be at least 2.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Find the second largest element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }
}
