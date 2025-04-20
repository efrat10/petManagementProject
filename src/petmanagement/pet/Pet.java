package petmanagement.pet;

// Abstract class representing a generic Pet
public abstract class Pet {
    final private String name;     // Pet's name (private)
    final private int age;        // Pet's age (private)
    protected String species; // Pet's species (protected)

    // Constructor
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for species
    public String getSpecies() {
        return species;
    }

    // Abstract method to be implemented by subclasses
    public abstract String makeSound();

    // Abstract method to be implemented by subclasses
    public abstract String eat();
}