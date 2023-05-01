package JavaPrograms;

public class multiplyusingC {
    int num1;
    int num2;
    int result;
    multiplyusingC(int num1,int num2)
    {
        result = num1 * num2;
    }
    int getresult()
    {
        return result;
    }
    public static void main(String[] args) {
        multiplyusingC multiply = new multiplyusingC(6, 6);
        int result = multiply.getresult();
        System.out.println(result);
    }
}
