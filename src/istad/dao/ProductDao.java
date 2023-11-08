package istad.dao;


import istad.model.Product;

import javax.sound.sampled.Port;
import java.util.List;
import java.util.Optional;

public interface ProductDao {
    //CRUD create read update deleted
   Product insert(Product product);
   List<Product> select();
  Optional<Product> selectById(Long id);
   Product  updateById(Product product);
   Product  deletedById(Long id);
   List<Product>  selectByName(String name);
}
