package istad.dao;

import istad.database.ProductDatabase;
import istad.exception.ProductNotFoundException;
import istad.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductDaoImpl implements ProductDao{
    private final ProductDatabase productDb;
    public ProductDaoImpl(){
        productDb = new ProductDatabase();
    }
    @Override
    public Product insert(Product product) {
        productDb.getProducts().add(product);
        return product;
    }

    @Override
    public List<Product> select() {
        return productDb.getProducts();
    }

    @Override
    public Optional<Product> selectById(Long id) {
        return productDb.getProducts()
                .stream()
                .filter(product -> product.getId().equals(id)).findFirst();
    }

    @Override
    public Product updateById(Product product) {
        return productDb.getProducts().stream().filter(pro-> pro.getId()
                .equals(product.getId())).map(newPro-> product).findFirst()
                .orElseThrow(()->
                        new ProductNotFoundException(String.format("Product ID = %s does not exist   ", product.getId())
                        ));
    }

    @Override
    public Product deletedById(Long id) {
     Product productFound =  productDb.getProducts().stream().filter(pro-> pro.getId()
                        .equals(id)).findFirst()
                .orElseThrow(()->
                        new ProductNotFoundException("Product ID = %s does not exist   ")
                        );
     productDb.getProducts().remove(productFound);
        return productFound ;
    }

    @Override
    public List<Product> selectByName(String name) {
        return  productDb.getProducts().stream()
                .filter(product -> product.getName()
                        .toLowerCase().contains(name.toLowerCase())).toList();
    }
}
