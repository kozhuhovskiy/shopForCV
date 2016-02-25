package shop.dao;

import entities.Categories;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kirill on 24.02.2016.
 */
public interface CategoryDao {


    public void addCategory(Categories categories) throws SQLException;
    public void deleteCategory(Categories categories) throws SQLException;
    public Categories getCategories(int id) throws SQLException;
    public List<Categories> getCategories() throws SQLException;

}
