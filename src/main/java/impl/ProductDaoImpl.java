package impl;

import entities.Product;
import utils.HibernateUtil;
import org.hibernate.Session;
import shop.dao.ProductDao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kirill on 22.02.2016.
 */
public class ProductDaoImpl implements ProductDao {


    public void addProduct(Product products) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(products);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
            session.close();
    }


    public void deleteProduct(Product products) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(products);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();
    }

    public Product getProduct(int id) throws SQLException {
        Product result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Product) session.get(Product.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();


        return result;
    }

    public List<Product> getProduct() throws SQLException {
        List<Product> products = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            products = session.createCriteria(Product.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();

        return products;
    }
}
