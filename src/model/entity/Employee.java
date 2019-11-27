package model.entity;

import java.util.Date;

public class Employee extends Person {
    private int registerNumber;
    private Date admissionDate;
    private boolean manager;

    public Employee(int registerNumber, Date admissionDate, boolean manager, String name, String email, Date birthDate, String cpf, String landLine, String mobile, String address, String city, String stateProvince) {
        super(name, email, birthDate, cpf, landLine, mobile, address, city, stateProvince);
        this.registerNumber = registerNumber;
        this.admissionDate = admissionDate;
        this.manager = manager;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }
    
}
