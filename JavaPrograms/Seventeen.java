package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seventeen {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int targetSum = 12;

        List<List<Integer>> pairs = findPairsWithSum(array, targetSum);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Target Sum: " + targetSum);
        System.out.println("Pairs with Sum " + targetSum + ":");
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }

    public static List<List<Integer>> findPairsWithSum(int[] array, int targetSum) {
        List<List<Integer>> pairs = new ArrayList<>();

        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            int num1 = array[i];

            // Check if there is a pair with the target sum
            for (int j = i + 1; j < array.length; j++) {
                int num2 = array[j];
                if (num1 + num2 == targetSum) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(num1);
                    pair.add(num2);
                    pairs.add(pair);
                }
            }
        }

        return pairs;
    }
}
