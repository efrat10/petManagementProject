package petmanagement.pet;


// Subclass representing a Cat which is a type of Pet
public class Cat extends Pet {
    final private String color; // Cat's color (private)

    // Constructor
    public Cat(String name, int age, String species, String color) {
        super(name, age, species); // Call to Pet constructor
        this.color = color;
    }

    // Implementation of abstract method
    @Override
    public String makeSound() {
        return "Cats meow";
    }

    // Implementation of abstract method
    @Override
    public String eat() {
        return "Cats eat cat food";
    }

    // Getter for color
    public String getColor() {
        return color;
    }
}