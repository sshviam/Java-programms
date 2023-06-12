package JavaPrograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Nine {
    public static void main(String[] args) {
        String[] array1 = {"apple", "orange", "banana", "grape"};
        String[] array2 = {"banana", "grapefruit", "kiwi", "apple"};

        List<String> commonElements = findCommonElements(array1, array2);

        System.out.println("Array 1: " + java.util.Arrays.toString(array1));
        System.out.println("Array 2: " + java.util.Arrays.toString(array2));
        System.out.println("Common Elements: " + commonElements);
    }

    public static List<String> findCommonElements(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        for (String element : array1) {
            set1.add(element);
        }

        List<String> commonElements = new ArrayList<>();
        for (String element : array2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
        }

        return commonElements;
    }
}
