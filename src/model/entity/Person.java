package model.entity;

public class Person {

    String cpf;
    String name;
    String email;
    String cellPhone;
    String homePhone;

    public Person() {
    }

    public Person(String cpf) {
        this.cpf = cpf;
    }

    public Person(String cpf, String name, String email, String cellPhone, String homePhone) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.cellPhone = cellPhone;
        this.homePhone = homePhone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
}
