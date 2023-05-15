package JavaPrograms;
//interface A{
//    abstract void run();
//}
//public class inter implements A{
//    public void run(){
//        System.out.println("I am running");
//    }
//    public static void main(String[] args) {
        
//    }
    
//}
//interface A{
//    public void eat();
//}
//interface B{
//    public void run();
//}
//interface C{
//    public void sleep();
//}
//class inter implements A,B,C{
//    public void eat()
//    {
//        System.out.println("I am running");
//    }
//    public void run()
//    {
//        System.out.println("I am eating");
//    }
//    public void sleep()
//    {
//        System.out.println("I am sleeping");
//    }
//    public static void main(String[] args) {
//        inter obj = new inter();
//    }
//}

interface A{
    public void eat();
}
interface B extends A{
    public void run();
}
interface C extends B{
    public void sleep();
}
class inter implements C{
    public void eat()
    {
        System.out.println("I am eating");
    }
    public void run()
    {
        System.out.println("I am running");
    }
    public void sleep()
    {
        System.out.println("I am sleeping");
    }
    public static void main(String[] args) {
        inter obj = new inter();
    }
}
