package JavaPrograms;
// import java.util.Arrays;
// public class Two {
//     public static void main(String[] args) {
//         int[] array = {5,10,15,20,25,30};
//         int elementToRemove = 15;
//         System.out.println("Original Array: "+Arrays.toString(array));
//         int[] newArray = removeElement(array,elementToRemove);
//         System.out.println("Array after removing element "+ elementToRemove+": "+Arrays.toString(newArray));
//     }
//         public static int[] removeElement(int[] array, int element)
//         {
//             int count = 0;
//             for (int i = 0; i< array.length; i++)
//             {
//                 if (array[i] == element)
//                 {
//                     count++;
//                 }
//             }
//             int [] newArray = new int[array.length - count];
//             int newIndex = 0;
//             for (int i=0; i< array.length; i++)
//             {
//                 if(array[i] != element)
//                 {
//                     newArray[newIndex] = array[i];
//                     newIndex++;
//                 }
//             }
//             return newArray;
//         }
// }

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int elementToRemove = 15;

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] newArray = removeElement(array, elementToRemove);

        System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] array, int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count++;
            }
        }
        int[] newArray = new int[array.length - count];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }

        return newArray;
    }
}

