package JavaPrograms;
interface A{
    public void parent();
}
class sampleinter implements A{
    public void parent()
    {
        System.out.println("This is parent class");
    }
}
class parent2 extends sampleinter{
    {
        System.out.println("This is sceond parent class");
    }
}
class child extends parent2{
    {
        System.out.println("This is child class");
    }
    public static void main(String[] args) {
        child obj = new child();
        parent2 obj1 = new parent2();
        sampleinter obj2 = new sampleinter();
    }
}