package JavaPrograms;

public class Rstring {
    public static void main(String[] args) {
        String originalString = "Ramesh";
        StringBuilder reversedString = new StringBuilder(originalString);
        reversedString = reversedString.reverse();
        String result = reversedString.toString();
        System.out.println("Reversed String :"+result);
    }
}
