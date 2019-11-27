
package model.entity;

import java.util.Date;


public class Procedure {
    private int name;
    private Date time;
    private Customer customer;
    private Employee employee;

    public Procedure(int name, Date time, Customer customer, Employee employee) {
        this.name = name;
        this.time = time;
        this.customer = customer;
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
