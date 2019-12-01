package model.dao;

import model.entity.Address;
import model.entity.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderDao implements Dao<Order> {
    Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private final String table = "orders";

    @Override
    public Order get(long id) {

        String sql = "SELECT * FROM " + table + " WHERE id = ?;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Long.toString(id));
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return createOrderByResult(result);
            }
        } catch (SQLException e) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, "Problema ocorrido no OrderDao.get().", e);
        }

        return null;

    }

    @Override
    public List<Order> getAll() {
        String sql = "SELECT * FROM " + table + ";";

        List<Order> orderList = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()){
                orderList.add(createOrderByResult(result));
            }
            return orderList;
        } catch (SQLException e) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, "Problema ocorrido no OrderDao.get().", e);
        }

        return null;


    }

    @Override
    public void save(Order order) {
        String sql = "INSERT INTO " + table
                + "(time, total, product, payment, appointment, procedure, customer) VALUES(?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, order.getTime());
            statement.setDouble(2, order.getTotal());
            statement.setObject(3, order.getProduct());
            statement.setObject(4, order.getPayment());
            statement.setObject(5, order.getAppointment());
            statement.setObject(6, order.getProcedure());
            statement.setObject(7, order.getCustomer());
            statement.execute();
        } catch (SQLException e) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, "Problema ocorrido no OrderDao.get().", e);
        }
    }

    @Override
    public void update(Order order) {
        String sql = "UPDATE " + table + " SET "
                + "time = ?, "
                + "total = ?, "
                + "product = ?, "
                + "payment = ?, "
                + "appointment = ?, "
                + "procedure = ? "
                + "customer = ? "
                + "WHERE id = ?;";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setObject(1, order.getTime());
            statement.setDouble(2, order.getTotal());
            statement.setObject(3, order.getProduct());
            statement.setObject(4, order.getPayment());
            statement.setObject(5, order.getAppointment());
            statement.setObject(6, order.getProcedure());
            statement.setObject(7, order.getCustomer());
            statement.setObject(8, order.getId());
            statement.execute();
        } catch (SQLException e) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, "Problema ocorrido no OrderDao.get().", e);
        }
    }

    @Override
    public void delete(Order order) {
        String sql = "DELETE FROM  " + table + " WHERE id = ?;";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Long.toString(order.getId()));
            statement.execute();
        } catch (SQLException e) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, "Problema ocorrido no OrderDao.get().", e);
        }
    }

    private Order createOrderByResult(ResultSet result) throws SQLException {
        Order order = new Order();
        order.setId(result.getLong("id"));
//        order.setTime(result.getObject("time"));
        order.setTotal(result.getDouble("total"));
//        order.setProduct(result.getObject("product"));
//        order.setPayment(result.getObject("payment"));
//        order.setAppointment(result.getObject("appointment"));
//        order.setProcedure(result.getObject("procedure"));
//        order.setCustomer(result.getObject("customer"));
        return order;
    }
}
