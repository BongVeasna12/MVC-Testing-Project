package istad.controller;
import istad.model.Product;
import istad.service.ProductService;
import istad.service.ProductServiceImpl;
import istad.view.ProductView;

import java.util.List;

public class ProductController {
    private final ProductService productService;
    ProductServiceImpl productServiceImpl;

        public ProductController(){

        productService = new ProductServiceImpl();
    }

        public ProductController(ProductService productService) {

        this.productService = productService;
    }

    public void index(){
      List<Product> products = productService.select();
      ProductView.printProductList(products);
    }
}
