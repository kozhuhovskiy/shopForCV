package shop.dao;

import entities.Shop;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kirill on 24.02.2016.
 */
public interface ShopDao {

    public void addShop(Shop shop) throws SQLException;
    public void deleteShop(Shop shop) throws SQLException;
    public Shop getShop(int id) throws SQLException;
    public List<Shop> getShop() throws SQLException;
}
