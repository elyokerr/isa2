package isa2;

public class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        // Create first instance of Dog
        Dog dog1 = new Dog("Buddy", "Labrador");

        // Create second instance of Dog
        Dog dog2 = new Dog("Max", "German Shepherd");

        // Print details of dogs before modification
        System.out.println("Details of dog1:");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println();

        System.out.println("Details of dog2:");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Breed: " + dog2.getBreed());
        System.out.println();

        // Modify attributes using setter methods
        dog1.setName("Rocky");
        dog2.setBreed("Golden Retriever");

        // Print updated details of dogs
        System.out.println("Updated details of dog1:");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println();

        System.out.println("Updated details of dog2:");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Breed: " + dog2.getBreed());
    }
}

