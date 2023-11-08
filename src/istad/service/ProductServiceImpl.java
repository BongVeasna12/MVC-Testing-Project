package istad.service;

import istad.dao.ProductDao;
import istad.dao.ProductDaoImpl;
import istad.exception.ProductNotFoundException;
import istad.model.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private  final ProductDao productDao;
    public ProductServiceImpl(){
        productDao = new ProductDaoImpl();
    }


    @Override
    public Product insert(Product product) {
        return productDao.insert(product);
    }

    @Override
    public List<Product> select() {
        return  productDao.select();
    }

    @Override
    public Product selectById(Long id) {
        return productDao.selectById(id).orElseThrow(()-> new ProductNotFoundException(
                String.format("Product ID = %s does not exist ", id)));

    }

    @Override
    public Product updateById(Product product) {
        return productDao.updateById(product);
    }

    @Override
    public Product deletedById(Long id) {
        return productDao.deletedById(id);
    }

    @Override
    public List<Product> selectByName(String name) {
        return productDao.selectByName(name);
    }
}
