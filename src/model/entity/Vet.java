package model.entity;

import java.util.Date;

public class Vet extends Employee {

    public Vet(int registerNumber, Date admissionDate, boolean manager, String name, String email, Date birthDate, String cpf, String landLine, String mobile, String address, String city, String stateProvince) {
        super(registerNumber, admissionDate, manager, name, email, birthDate, cpf, landLine, mobile, address, city, stateProvince);
    }
    
}
