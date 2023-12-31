package istad.view;
import istad.model.Product;

import java.util.List;

import  static java.lang.System.*;
public class ProductView {
    public static void printProductList(List<Product> products){
        out.println("Product List");
        products.forEach(product -> {
            out.println("ID :" +" " + product.getId());
            out.println("NAME :" + " " + product.getName());
            out.println("QTY :" + " " + product.getQty());
            out.println("PRICE :" +" " + product.getPrice());
            out.println("DATE :" + " " + product.getImportedDate());
        });
    }
}
