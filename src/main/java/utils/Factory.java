package utils;

import impl.CategoryDaoImpl;
import impl.ProductDaoImpl;
import impl.ShopDaoImpl;
import shop.dao.CategoryDao;
import shop.dao.ProductDao;
import shop.dao.ShopDao;

/**
 * Created by Kirill on 22.02.2016.
 */
public class Factory {

    public static Factory instance = new Factory();
    private ProductDao productDao;
    private ShopDao shopDao;
    private CategoryDao categoryDao;
    private Factory(){

    }
    public static Factory getInstance(){

        return Factory.instance;
    }


    public ProductDao getProductDao(){
        if (productDao == null)productDao = new ProductDaoImpl();
        return productDao;
    }

    public ShopDao getShopDao(){
        if (shopDao == null)shopDao = new ShopDaoImpl();
        return shopDao;
    }

    public CategoryDao getCategoryDao(){
        if (categoryDao == null)categoryDao = new CategoryDaoImpl();
        return categoryDao;
    }


}
