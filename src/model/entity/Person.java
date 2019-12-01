package model.entity;

public abstract class Person {

    String cpf;
    String name;
    String email;
    String phone;
    String mobile;

    public Person() {}

    public Person(String cpf) {
        this.cpf = cpf;
    }

    public Person(String cpf, String name, String email, String phone, String mobile) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
