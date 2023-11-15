package istad.util;

import istad.controller.MenuController;
import istad.controller.ProductController;
import istad.service.ProductService;
import istad.service.ProductServiceImpl;

import java.util.Scanner;

public class Singleton {
    private static Scanner scanner;
    private static MenuController menuController;
    private static ProductController productController;
    private static ProductServiceImpl productServiceImpl;

    //Create instance of Scanner
    public  static Scanner scanner(){
        if (scanner == null){
           scanner = new Scanner(System.in);
        }
        return scanner;
    }
    public  static MenuController menuController(){
        if (menuController == null){
            menuController= new MenuController();
        }
        return menuController;
    }
    //3.instance of Product Controller

    public  static ProductController productController(){
        if (productController == null){
            productController= new ProductController();
        }
        return productController;
    }
    public  static ProductServiceImpl getProductServiceImpl(){
        ProductServiceImpl ProductServiceImpl;
        if (productServiceImpl == null){
            productServiceImpl= new ProductServiceImpl();
        }
        return productServiceImpl;
    }

}

