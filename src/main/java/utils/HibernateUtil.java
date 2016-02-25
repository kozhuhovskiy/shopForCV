package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Kirill on 22.02.2016.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    private HibernateUtil(){

    }
   static {

       try {
           sessionFactory = new Configuration().configure().buildSessionFactory();
       }catch (Throwable e) {

           throw new ExceptionInInitializerError(e);
       }

     /*  File file = new File("src/main/resources/hibernate.cfq.xml");
        Configuration configuration = new Configuration().configure(file);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());*/
            }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
