package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sixteen {
    xpublic static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");

        String[] array = convertArrayListToArray(arrayList);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static <T> T[] convertArrayListToArray(List<T> arrayList) {
        T[] array = (T[]) arrayList.toArray(new Object[0]);
        return array;
    }
}
