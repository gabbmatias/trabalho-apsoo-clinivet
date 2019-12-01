package model.entity;

public class Appointment {
    double id;
    String type;
    double price;

    public Appointment() {
    }

    public Appointment(double id) {
        this.id = id;
    }

    public Appointment(String type) {
        this.type = type;
    }

    public Appointment(double id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
