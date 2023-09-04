public class MultiInheritance {
    MultiInheritance()
    {
        System.out.println("This is deafult one");
    }

    MultiInheritance (String name, int age)
    {
        System.out.println("name :"+name+"age :"+age);
    }
    class Next extends MultiInheritance
    {
    Next()
        {
            System.out.println("This is next type");
        }
    }

    public static void main(String[] args) {
        MultiInheritance obj1 = new MultiInheritance();
        Next obj2 = new Next();
