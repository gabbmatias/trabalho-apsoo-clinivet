package model.entity;
import java.util.Calendar;

public class Employee extends Person {

    long id;
    long register;
    String login;
    String password;
    Calendar birthDate;
    Calendar admission;
    boolean admin;

    public Employee() {
    }

    public Employee(long id) {
        this.id = id;
    }



    public Employee(String cpf, String name, String email, String phone, String mobile, Address address, long id, long register, String login, String password, Calendar birthDate, Calendar admission) {
        super(cpf, name, email, phone, mobile, address);
        this.id = id;
        this.register = register;
        this.login = login;
        this.password = password;
        this.birthDate = birthDate;
        this.admission = admission;
        this.admin = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRegister() {
        return register;
    }

    public void setRegister(long register) {
        this.register = register;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public Calendar getAdmission() {
        return admission;
    }

    public void setAdmission(Calendar admission) {
        this.admission = admission;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
