package test;
import model.dao.EmployeeDao;
import model.db.DbConnection;
import model.entity.Employee;

import java.sql.Connection;

public class EmployeeDaoTest {
    public static void main(String[] args) {
        Connection connection  = DbConnection.getInstance();
        EmployeeDao dao = new EmployeeDao();
        dao.setConnection(connection);

        //Employee employee = dao.get(1);

        Employee employee = dao.get("paulo", "teste");

        System.out.println(employee.getName());
        System.out.println(employee.getAddress().getStreet());


    }

}
