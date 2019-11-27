
package model.entity;

import java.util.Date;

public class Appointment extends Procedure{
    private String symptoms;

    public Appointment(String symptoms, int name, Date time, Customer customer, Employee employee) {
        super(name, time, customer, employee);
        this.symptoms = symptoms;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
      
}
