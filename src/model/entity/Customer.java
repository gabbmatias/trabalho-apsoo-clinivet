package model.entity;

public class Customer extends Person {

    double id;

    public Customer() {
    }

    public Customer(String cpf) {
        super(cpf);
    }

    public Customer(double id) {
        this.id = id;
    }

    public Customer(String cpf, double id) {
        super(cpf);
        this.id = id;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}
