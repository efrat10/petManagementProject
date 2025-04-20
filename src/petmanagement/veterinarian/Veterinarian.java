package petmanagement.veterinarian;

import petmanagement.pet.Pet;

// Interface defining the behaviors of a Veterinarian
public interface Veterinarian {
    String getName(); // Method to get the veterinarian's name
    String examinePet(Pet pet); // Method to examine a pet
}
