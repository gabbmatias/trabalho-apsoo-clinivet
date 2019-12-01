package model.entity;

public class Product {
    double id;
    String name;
    double price;

    public Product() {
    }

    public Product(double id) {
        this.id = id;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(double id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
