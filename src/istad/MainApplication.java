package istad;

import istad.controller.MenuController;
import istad.controller.ProductController;
import istad.dao.ProductDao;
import istad.model.Product;
import istad.service.ProductService;
import istad.service.ProductServiceImpl;
import istad.util.Singleton;
import istad.view.MenuView;
import istad.view.ProductView;

import java.util.List;
import java.util.Scanner;

public class MainApplication {
    private final Scanner scanner;
    private final MenuController menuController;
    private final ProductController productController;
    public MainApplication(){
        scanner = Singleton.scanner();
        menuController = Singleton.menuController();
        productController = Singleton.productController();
    }
    private void  run(){
        menuController.index();
        System.out.println("Enter the Option!!");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option){
            case 1 ->  productController.index();
            default -> throw  new IllegalStateException();
        }
    }
    public static void main(String[] args) {
          new MainApplication().run();
    }

}
