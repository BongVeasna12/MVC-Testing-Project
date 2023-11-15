package istad.database;

import istad.dao.ProductDaoImpl;
import istad.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private final List<Product> products;
    public ProductDatabase(){
        products= new ArrayList<>();
        products.add(new Product(1L, "Sting ", 400, 50.00 , LocalDate.now()));
        products.add(new Product(2L, "CoCa ", 300, 40.00 , LocalDate.now()));
        products.add(new Product(3L, "Cambodia ", 200, 50.00 , LocalDate.now()));
        products.add(new Product(4L, "Prime ", 400, 110.00 , LocalDate.now()));
        products.add(new Product(4L, "Spring ", 400, 140.00 , LocalDate.now()));
    }
    public List<Product> getProducts(){
        return products;
    }
}
