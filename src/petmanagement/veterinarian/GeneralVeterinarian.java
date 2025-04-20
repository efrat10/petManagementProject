package petmanagement.veterinarian;

import petmanagement.pet.Pet;

// Class representing a general veterinarian
public class GeneralVeterinarian implements Veterinarian {
    private String name; // Veterinarian's name (private)

    // Constructor
    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    // Implementation of method to get the veterinarian's name
    @Override
    public String getName() {
        return name;
    }

    // Implementation of method to examine a pet
    @Override
    public String examinePet(Pet pet) {
        return "Examination of " + pet.getName() + ": general health checkup.";
    }
}
