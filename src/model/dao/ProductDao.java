package model.dao;

import model.entity.Address;
import model.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDao implements Dao<Product>{
    Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private final String table = "products";

    @Override
    public Product get(long id) {
        String sql = "SELECT * FROM " + table + " WHERE id = ?;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, Long.toString(id));
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return createProductByResult(result);
            }
        } catch (SQLException e) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, "Problema ocorrido no ProductDao.get().", e);
        }

        return null;
    }

    @Override
    public List<Product> getAll() {
        String sql = "SELECT * FROM " + table + ";";

        List<Product> productList = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while (result.next()){
                productList.add(createProductByResult(result));
            }
            return productList;
        } catch (SQLException e) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, "Problema ocorrido no ProductDao.get().", e);
        }

        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    private Product createProductByResult(ResultSet result) throws SQLException {
        Product product = new Product();
        product.setId(result.getLong("id"));
        product.setName(result.getString("name"));
        product.setPrice(result.getDouble("price"));
        return product;
    }
}
