package petmanagement.main;

import petmanagement.pet.Cat;
import petmanagement.pet.Dog;
import petmanagement.pet.Pet;
import petmanagement.veterinarian.GeneralVeterinarian;
import petmanagement.veterinarian.SpecialistVeterinarian;
import petmanagement.veterinarian.Veterinarian;

import java.util.ArrayList;
import java.util.List;

// Main class that simulates a pet clinic
public class PetClinic {
    public static void main(String[] args) {
        // Create a list to hold pets
        List<Pet> pets = new ArrayList<>();
        // Add pets to the list
        pets.add(new Dog("Rocky", 3, "Canine", "German"));
        pets.add(new Dog("Mocha", 5, "Canine", "Labrador"));
        pets.add(new Cat("Mitzi", 2, "Feline", "Tabby"));
        pets.add(new Cat("Chili", 4, "Feline", "Black"));

        // Create veterinarian instances
        Veterinarian generalVet = new GeneralVeterinarian("Dr. Smith");
        Veterinarian specialistVet = new SpecialistVeterinarian("Dr. Jones", "feline health");

        // Demonstrate functionalities of pets and veterinarians
        for (Pet pet : pets) {
            // Display pet details
            System.out.println("Pet Name: " + pet.getName());
            System.out.println("Species: " + pet.getSpecies());
            System.out.println("Age: " + pet.getAge());
            System.out.println("Sound: " + pet.makeSound());
            System.out.println("Eating habit: " + pet.eat());
            System.out.println(generalVet.getName() + ": " + generalVet.examinePet(pet));

            // If the pet is a feline, also use the specialist veterinarian
            if (pet.getSpecies().equals("Feline")) {
                System.out.println(specialistVet.getName() + ": " + specialistVet.examinePet(pet));
            }
            System.out.println("-----------");
        }
    }
}
