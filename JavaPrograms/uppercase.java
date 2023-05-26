package JavaPrograms;

public class uppercase {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("Hello World");
        String s = sbd.replace(5, 11, "").append("r2d2").toString();
        System.out.println(sbd);
        System.out.println(s.toLowerCase());
    }
}