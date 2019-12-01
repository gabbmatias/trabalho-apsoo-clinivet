package model.entity;

import java.util.Calendar;

public class ProcedureSchedule {
    double id;
    Calendar time;
    boolean performed;
    Procedure procedure;
    Animal animal;

    public ProcedureSchedule() {
    }

    public ProcedureSchedule(double id) {
        this.id = id;
    }

    public ProcedureSchedule(Calendar time) {
        this.time = time;
    }

    public ProcedureSchedule(double id, Calendar time, boolean performed, Procedure procedure, Animal animal) {
        this.id = id;
        this.time = time;
        this.performed = performed;
        this.procedure = procedure;
        this.animal = animal;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public boolean isPerformed() {
        return performed;
    }

    public void setPerformed(boolean performed) {
        this.performed = performed;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
