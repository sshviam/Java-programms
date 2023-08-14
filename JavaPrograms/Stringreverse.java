public class Stringreverse {
    
    public static void main(String[] args) {
        String str = "BATMAN", nstr = "";
        char ch;
        System.out.println("This is original string :BATMAN");
        for (int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("This is reversed string :"+nstr);
    }
} 
/*for (int i = str.length() - 1; i >= 0; i--)
 * {
 * ch = str.charAt(i);
 * nstr = nstr + ch;
 * }
 */