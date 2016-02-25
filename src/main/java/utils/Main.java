package utils;

import entities.Categories;
import entities.Product;
import entities.Shop;
import entities.Status;
import shop.dao.CategoryDao;
import shop.dao.ProductDao;
import shop.dao.ShopDao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Kirill on 22.02.2016.
 */
public class Main implements Runnable {

    public void run() {

    }
    public static void main(String[] args) throws SQLException {
         // SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Factory factory = Factory.getInstance();




        /*CREATE CATEGORIES*/

        CategoryDao categoryDao = factory.getCategoryDao();
        Categories categories = new Categories();
        categories.setCategoryName("CARS");
        categoryDao.addCategory(categories);
        categories.setCategoryName("CARS FOR GIRLS");
        categoryDao.addCategory(categories);
        categories.setCategoryName("Shoes");
        categoryDao.addCategory(categories);
        categories.setCategoryName("Smartphones, TV-s");
        categoryDao.addCategory(categories);


        /*ADD PRODUCTS*/

        ProductDao productDao = factory.getProductDao();
        Product product = new Product();
        product.setTitle("BMW X1");
        product.setPrice(35000);
        product.setStatus(Status.AVAILABLE);
        productDao.addProduct(product);

        product.setTitle("Samsung Galaxy S7 EDGE");
        product.setPrice(650);
        product.setStatus(Status.EXPECTED);
        productDao.addProduct(product);

        product.setTitle("Nokia 1000");
        product.setPrice(50);
        product.setStatus(Status.ABSENT);
        productDao.addProduct(product);


        product.setTitle("WV PASSSAT B8");
        product.setPrice(32000);
        product.setStatus(Status.AVAILABLE);
        productDao.addProduct(product);


        product.setTitle("NIKE ROSH RUN");
        product.setPrice(100);
        product.setStatus(Status.AVAILABLE);
        productDao.addProduct(product);

        product.setTitle("LG 47* LED");
        product.setPrice(300);
        product.setStatus(Status.AVAILABLE);
        productDao.addProduct(product);

        product.setTitle("NIKE BEST SHOES");
        product.setPrice(900);
        product.setStatus(Status.AVAILABLE);
        productDao.addProduct(product);


        ShopDao shopDao = factory.getShopDao();
        Shop shop = new Shop();
        shop.setShopName("Shop №1 *ROZETKA.UA*");
        shopDao.addShop(shop);
        shop.setShopName("Shop №2 *AUTO-RIA.UA*");
        shopDao.addShop(shop);


        List<Shop> shopList = shopDao.getShop();
        List<Product> productsList = productDao.getProduct();

        Thread thread1 = new ShopThread(10000, "Thread 1");
        Thread thread2 = new ShopThread(10000, "Thread 2");

        thread1.start();
            for (Shop shop1 : shopList) {
                shop1.getId();
                shop1.getShopName();
                shop1.getCategories();
                shop1.setProducts(productDao.getProduct(1));
            }

        thread2.start();
        for (Product product1: productsList){
            double newPrice = 1.5;
            double summ = product1.getPrice();
            double temp = summ*newPrice;
            product1.setPrice(temp);

        }


        }



        }


     /*
      *
       * *//*ADD PRODUCTS*//*
      Factory factory = Factory.getInstance();
        ProductDao productDao = factory.getProductDao();
        Product product = new Product();
        product.setTitle("BMW X1");
        product.setPrice(35000);
        product.setStatus(Status.AVAILABLE);
        productDao.addProduct(product);

        product.setTitle("Samsung Galaxy S7 EDGE");
        product.setPrice(650);
        product.setStatus(Status.EXPECTED);
        productDao.addProduct(product);

        product.setTitle("Nokia 1000");
        product.setPrice(50);
        product.setStatus(Status.ABSENT);
        productDao.addProduct(product);


        product.setTitle("WV PASSSAT B8");
        product.setPrice(32000);
        product.setStatus(Status.AVAILABLE);
        productDao.addProduct(product);

        *//*CREATE CATEGORIES*//*

        CategoryDao categoryDao = factory.getCategoryDao();
        Categories categories = new Categories();
        categories.setCategoryName("CARS");
        categoryDao.addCategory(categories);
        categories.setCategoryName("Smartphones");
        categoryDao.addCategory(categories);


            *//*ADD SHOPS AND KEYS FROM OTHER TABLES*//*
        ShopDao shopDao = factory.getShopDao();
        Shop shop = new Shop();

        shop.setShopName("Shop №1 *ROZETKA.UA*");
        shop.setCategories(categoryDao.getCategories(2));
        shop.setProducts(productDao.getProduct(3));
        shopDao.addShop(shop);

        shop.setShopName("Shop №2 *AUTO-RIA.UA*");
        shop.setCategories(categoryDao.getCategories(1));
        shop.setProducts(productDao.getProduct(4));
        shopDao.addShop(shop);

        shopDao.getShop(1);
        shop.setCategories(categoryDao.getCategories(2));
        shop.setProducts(productDao.getProduct(2));
        shopDao.addShop(shop);
*/

      /*  List<Product> productsList = productDao.getProduct();


        System.out.println("id   title      price    status");


        for (Product product : productsList) {
            System.out.printf(product.getTitle() + " " + product.getId() + " "
                    +  product.getPrice() + " " +  product.getStatus() );
        }*/





         /*class ShopThread extends Thread {
            Factory factory = Factory.getInstance();
            CategoryDao categoryDao = factory.getCategoryDao();
            ProductDao productDao = factory.getProductDao();
            private int delay;

            public ShopThread(int delay){

                this.delay = delay;
            }

            public void run(){






                *//**//*
               *//* for (int i = 0; i < 3 ; i++) {
                    ShopDao shopDao = factory.getShopDao();
                    Shop shop = new Shop();
                    try {
                        shop.setCategories(categoryDao.getCategories(i));
                        shop.setProducts(productDao.getProduct(i));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }*//*

            }

        }

        Thread thread1 = new ShopThread(10000);
        Thread thread2 = new ShopThread(10000);

        thread1.start();*/










