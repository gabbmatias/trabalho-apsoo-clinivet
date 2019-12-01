package model.entity;

public class Species {
    double id;
    String name;

    public Species() {
    }

    public Species(double id) {
        this.id = id;
    }

    public Species(String name) {
        this.name = name;
    }

    public Species(double id, String name) {
        this.id = id;
        this.name = name;
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
}
