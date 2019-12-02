package model.bo;

import model.dao.EmployeeDao;
import model.db.DbConnection;
import model.entity.Employee;

import java.sql.Connection;

public class EmployeeBo {

    EmployeeDao employeeDao = new EmployeeDao();

    public EmployeeBo() {
        Connection connection = DbConnection.getInstance();
        employeeDao.setConnection(connection);
    }

    public Employee login(String login, String password){
        return employeeDao.get(login, password);
    }
}
