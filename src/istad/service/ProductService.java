package istad.service;

import istad.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

        //CRUD create read update deleted
        Product insert(Product product);
        List<Product> select();
        Product selectById(Long id);
        Product  updateById(Product product);
        Product  deletedById(Long id);
        List<Product>  selectByName(String name);

}
