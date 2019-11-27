
package model.entity;

public class Agenda {
   private Employee employee;
   private Customer customer;
   private Procedure procedure;

    public Agenda(Employee employee, Customer customer, Procedure procedure) {
        this.employee = employee;
        this.customer = customer;
        this.procedure = procedure;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
   
   
}
