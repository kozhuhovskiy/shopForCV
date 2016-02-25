package impl;

import entities.Categories;
import org.hibernate.Session;
import shop.dao.CategoryDao;
import utils.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kirill on 24.02.2016.
 */
public class CategoryDaoImpl implements CategoryDao {


    public void addCategory(Categories categories) throws SQLException {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(categories);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();
    }

    public void deleteCategory(Categories categories) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(categories);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();


    }

    public Categories getCategories(int id) throws SQLException {
        Categories result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Categories) session.get(Categories.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();


        return result;
    }

    public List<Categories> getCategories() throws SQLException {
            List<Categories> categories = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            categories = session.createCriteria(Categories.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();
        return categories;
    }
}
