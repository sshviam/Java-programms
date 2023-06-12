package JavaPrograms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Eight {
    public static void main(String[] args) {
        String[] array = {"apple", "orange", "banana", "apple", "grape", "banana"};

        List<String> duplicates = findDuplicates(array);

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Duplicate Values: " + duplicates);
    }

    public static List<String> findDuplicates(String[] array) {
        List<String> duplicates = new ArrayList<>();
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (String element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Find the elements with frequency greater than 1
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}
