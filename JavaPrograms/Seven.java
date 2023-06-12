package JavaPrograms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seven {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 10, 20, 5, 25, 30, 20};

        List<Integer> duplicates = findDuplicates(array);

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Duplicate Values: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] array) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Find the elements with frequency greater than 1
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}
