package model.entity;

public class Vet extends Employee {

    double id;
    String crmv;

    public Vet() {
        super();
    }

    public Vet(double id) {
        super();
        this.id = id;
    }

    public Vet(String crmv) {
        super();
        this.crmv = crmv;
    }

    public Vet(String cpf, double id, String crmv) {
        super(cpf);
        this.id = id;
        this.crmv = crmv;
    }

    @Override
    public double getId() {
        return id;
    }

    @Override
    public void setId(double id) {
        this.id = id;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
}
