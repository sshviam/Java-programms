package JavaPrograms;

public class bytetoarray {
    public static void main(String[] args) {
        String str = "Superman can't poop in pants";
        byte[] arr = str.getBytes();
        String s = new String(arr);
        
    }
}
