package JavaPrograms;
interface A{
    public void method();
}
interface B extends A{
    public void method();
}
abstract class Aclass implements B{
    public void method()
    {
        System.out.println("Method 1");
    }
}

public class abstractt  extends Aclass{
    public static void main(String[] args) {
        abstractt obj = new abstractt();
    }
}
