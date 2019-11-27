
package model.entity;

import java.util.Date;


public class Dvm extends Employee{
    private String crmv;

    public Dvm(String crmv, int registerNumber, Date admissionDate, boolean manager, String name, String email, Date birthDate, String cpf, String landLine, String mobile, String address, String city, String stateProvince) {
        super(registerNumber, admissionDate, manager, name, email, birthDate, cpf, landLine, mobile, address, city, stateProvince);
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
    
}
