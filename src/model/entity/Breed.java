package model.entity;

public class Breed {
    double id;
    String name;
    Species species;

    public Breed() {
    }

    public Breed(double id) {
        this.id = id;
    }

    public Breed(String name) {
        this.name = name;
    }

    public Breed(double id, String name, Species species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
}
