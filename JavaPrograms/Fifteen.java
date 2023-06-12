package JavaPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fifteen {
     public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange"};

        List<String> arrayList = convertArrayToArrayList(array);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("ArrayList: " + arrayList);
    }

    public static <T> List<T> convertArrayToArrayList(T[] array) {
        List<T> arrayList = new ArrayList<>(Arrays.asList(array));
        return arrayList;
    }
}
