package JavaPrograms;

public class uppercase {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("SHIVAM MISTRY");
        String s = sbd.replace(5, 11, "").append("R2D2").toString();
        System.out.println(sbd);
        System.out.println(s.toLowerCase());
    }
}