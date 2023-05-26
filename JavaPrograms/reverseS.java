package JavaPrograms;

public class reverseS{
    public static void main(String[] args) {
        String str = "Welcome", nstr = "";
        char ch;
        System.out.println("Original word :");
        System.out.println("Welcome");
        for (int i=0; i<str.length(); i++) 
        {
            ch = str.charAt(i);
            nstr = ch+nstr;
        }       
        System.out.println("Reversed word :"+nstr);
    }
}