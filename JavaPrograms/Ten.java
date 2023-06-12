package JavaPrograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ten {
     public static void main(String[] args) {
        int[] array1 = {5, 10, 15, 20};
        int[] array2 = {10, 20, 25, 30};

        List<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println("Array 1: " + java.util.Arrays.toString(array1));
        System.out.println("Array 2: " + java.util.Arrays.toString(array2));
        System.out.println("Common Elements: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int element : array1) {
            set1.add(element);
        }

        List<Integer> commonElements = new ArrayList<>();
        for (int element : array2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
        }

        return commonElements;
    }   
}
