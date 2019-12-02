package model.bo;

import model.dao.ProductDao;
import model.db.DbConnection;
import model.entity.Product;

import java.sql.Connection;
import java.util.List;

public class ProductBo {

    ProductDao productDao = new ProductDao();

    public ProductBo() {
        Connection connection = DbConnection.getInstance();
        productDao.setConnection(connection);
    }

    public List<Product> getAllProducts() {
        return productDao.getAll();
    }

    public void createProduct(Product product){
        productDao.save(product);
    }

    public void updateProduct(){

    }

    public void deleteProduct(){

    }

}
