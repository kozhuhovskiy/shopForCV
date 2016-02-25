package entities;

import javax.persistence.*;


@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name= "shop_name")
    private String shopName;
    @JoinColumn (name= "categories_id", referencedColumnName = "id")
    private Categories categories;
    @JoinColumn(name= "products_id", referencedColumnName = "id")
    private Product products;



    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
