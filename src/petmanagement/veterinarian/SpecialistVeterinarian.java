package petmanagement.veterinarian;

import petmanagement.pet.Pet;

// Class representing a specialist veterinarian
public class SpecialistVeterinarian implements Veterinarian {
    private String name; // Veterinarian's name (private)
    private String specialty; // Veterinarian's specialty (private)

    // Constructor
    public SpecialistVeterinarian(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // Implementation of method to get the veterinarian's name
    @Override
    public String getName() {
        return name;
    }

    // Implementation of method to examine a pet
    @Override
    public String examinePet(Pet pet) {
        return "Examination of " + pet.getName() + ": specialized examination in " + specialty + ".";
    }
}

