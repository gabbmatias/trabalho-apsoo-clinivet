package model.dao;
import model.entity.Address;
import model.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeDao implements Dao<Employee> {

    Connection connection;
    AddressDao addressDao = new AddressDao();

    public void setConnection(Connection connection) {
        this.connection = connection;
        addressDao.setConnection(connection);
    }

    private final String table = "employees";


    @Override
    public Employee get(long id) {
        String sql = "SELECT * FROM " + table + " WHERE id = ?;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Long.toString(id));
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return createEmployeeByResult(result);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, "Problema ocorrido no EmployeeDao.get().", e);
        }

        return null;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }

    private Employee createEmployeeByResult(ResultSet result) throws SQLException {
        Employee employee = new Employee();
        employee.setId(result.getLong("id"));
        employee.setRegister(result.getLong("register"));
        employee.setLogin((result.getString("login")));
        employee.setPassword(result.getString("password"));
        //employee.setBirthDate();
        //employee.setAdmission();
        employee.setAdmin(result.getBoolean("admin"));
        employee.setCpf(result.getString("cpf"));
        employee.setName(result.getString("name"));
        employee.setEmail(result.getString("email"));
        employee.setPhone(result.getString("phone"));
        employee.setMobile(result.getString("mobile"));
        employee.setAddress(addressDao.get(result.getLong("address_id")));
        return employee;
    }
}
