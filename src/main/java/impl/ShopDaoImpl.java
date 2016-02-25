package impl;

import entities.Shop;
import org.hibernate.Session;
import shop.dao.ShopDao;
import utils.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kirill on 24.02.2016.
 */
public class ShopDaoImpl implements ShopDao {
    public void addShop(Shop shop) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(shop);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();
    }

    public void deleteShop(Shop shop) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(shop);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();

    }

    public Shop getShop(int id) throws SQLException {
        Shop result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Shop) session.get(Shop.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();


        return result;

    }

    public List<Shop> getShop() throws SQLException {
        List<Shop> shops = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            shops = session.createCriteria(Shop.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally  {
            if ((session != null) && (session.isOpen()))session.close();

        }
        session.close();

        return shops;
    }
}
