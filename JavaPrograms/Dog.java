class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}

class main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Mamu", "Labrador");
        Dog dog2 = new Dog("Max", "Golden Retriever");

        System.out.println("Initial Values:");
        System.out.println("Dog 1: Name = " + dog1.getName() + ", Breed = " + dog1.getBreed());
        System.out.println("Dog 2: Name = " + dog2.getName() + ", Breed = " + dog2.getBreed());

        dog1.setName("Charlie");
        dog2.setBreed("Poodle");

        System.out.println("\nUpdated Values:");
        System.out.println("Dog 1: Name = " + dog1.getName() + ", Breed = " + dog1.getBreed());
        System.out.println("Dog 2: Name = " + dog2.getName() + ", Breed = " + dog2.getBreed());
    }
}

