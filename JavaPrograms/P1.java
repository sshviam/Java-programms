public class P1 {
    private String name;
    private int age;

    public P1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        
        P1 person1 = new P1("Shivam", 19);
        P1 person2 = new P1("Ohm", 21);

        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }   
}

