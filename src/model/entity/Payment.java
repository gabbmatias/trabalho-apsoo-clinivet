package model.entity;

public class Payment {
    double id;
    String type;

    public Payment() {
    }

    public Payment(double id) {
        this.id = id;
    }

    public Payment(String type) {
        this.type = type;
    }

    public Payment(double id, String type) {
        this.id = id;
        this.type = type;
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
}
