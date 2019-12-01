package model.entity;
import java.util.Calendar;

public class Employee extends Person {

    double id;
    int register;
    String login;
    String password;
    Calendar birthDate;
    Calendar admission;
    boolean admin;

    public Employee() {
        super();
    }

    public Employee(String cpf) {
        super(cpf);
    }

    public Employee(double id) {
        super();
        this.id = id;
    }

    public Employee(int register) {
        super();
        this.register = register;
    }

    public Employee(String cpf, double id, int register, String login, String password, Calendar birthDate, Calendar admission, boolean admin) {
        super(cpf);
        this.id = id;
        this.register = register;
        this.login = login;
        this.password = password;
        this.birthDate = birthDate;
        this.admission = admission;
        this.admin = admin;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
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
