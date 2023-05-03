package JavaPrograms;
/*CLass : tempplate/blueprint
 * Objects : instance of class
 * Method : behaviour
 * Constructor : intialize the objects of class
 */
public class constructor {
    constructor() //non parameterzied
    {
        System.out.println("This is construtor");
    }
    constructor(String name) //parameterzied constructor
    {
        System.out.println("This is another constructor"+name);
    }
    constructor(String name, int age)
    {
        System.out.println("Welcome"+name+" "+ "Your age is :"+age);
    }
    void display()
    {
        System.out.println("This is method of class");
    }
    void showDetails(String designation, float salary)
    {
        System.out.println("Your designation is :"+designation+"Your salary is :"+salary);
    }
    public static void main(String[] args) {
     constructor obj = new constructor();
     constructor obj1 = new constructor("Shivam");
     constructor obj2 = new constructor("Shivam" ,19);
     obj.display();
     obj.showDetails("CyberSecurity", 100000);
    }    
}