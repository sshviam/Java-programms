package JavaPrograms;
import java.util.Arrays;
public class Arrayy {
    public static void main(String[] args) {
        String str = "Batman is dark guy";
        byte[] arr = str.getBytes();
        // System.out.println(arr.length);           //it will print how many bytes are we are used included space also
        // System.out.println(arr);                  //it will print in random char and digits
        // System.out.println(Arrays.toString(arr)); //it will print the bytes of each character and
        System.out.printf("%3d",arr);
    }
}
