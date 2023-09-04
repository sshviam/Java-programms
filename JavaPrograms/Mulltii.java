public class Mulltii {
    Mulltii(){
        System.out.println("This is parent");
    }
}

class Animal extends Mulltii{
    Animal(){
        System.out.println("This is child");
    }
}

class lap extends Animal{
   public lap(String name, int age){
        System.out.println("Name :"+name+" "+"Age :"+age);
    }


public static void main(String[] args) {
    Mulltii obj = new Mulltii();
    Animal obj1 = new Animal();
    lap obj2 = new lap(shivam, 19);
}
}
