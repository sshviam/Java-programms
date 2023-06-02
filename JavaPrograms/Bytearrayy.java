package JavaPrograms;

public class Bytearrayy {
    public static void main(String[] args) {
        byte[] byteArray = new byte[5];
        for (int i = 0; i < byteArray.length; i++)
        {
            byteArray[i] = 1;
        }
        for (byte b : byteArray)
        {
                System.out.printf("%3d",b);
        }
    }
}
