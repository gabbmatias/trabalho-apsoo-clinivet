
package model.entity;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Customer customer;
    private ArrayList<Product> products;
    private double total;
    private Date date;

    public Order(Customer customer, ArrayList<Product> products, double total, Date date) {
        this.customer = customer;
        this.products = products;
        this.total = total;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
