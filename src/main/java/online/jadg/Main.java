package online.jadg;

import online.jadg.model.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product = new Product(1, "Product 1", 100);
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}