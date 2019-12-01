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

        Employee employee = dao.get(2);

        System.out.println(employee.getName());
        System.out.println(employee.getAddress().getStreet());


    }

}
