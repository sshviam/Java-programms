package JavaPrograms;

public class Five {
    public static void main(String[] args) {
        int[] array = {5, 10, 2, 8, 15};

        int max = findMaxValue(array);
        int min = findMinValue(array);

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static int findMaxValue(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int findMinValue(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}

