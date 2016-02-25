package shop.dao;

import entities.Product;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kirill on 22.02.2016.
 */
public interface ProductDao {

    public void addProduct(Product products) throws SQLException;
    public void deleteProduct(Product products) throws SQLException;
    public Product getProduct(int id) throws SQLException;
    public List<Product> getProduct() throws SQLException;
}
