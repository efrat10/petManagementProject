package petmanagement.pet;


// Subclass representing a Dog which is a type of Pet
public class Dog extends Pet {
    final private String breed; // Dog's breed (private)

    // Constructor
    public Dog(String name, int age, String species, String breed) {
        super(name, age, species); // Call to Pet constructor
        this.breed = breed;
    }

    // Implementation of abstract method
    @Override
    public String makeSound() {
        return "Dogs bark";
    }

    // Implementation of abstract method
    @Override
    public String eat() {
        return "Dogs eat dog food";
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }
}
