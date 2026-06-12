package estoque.application;

import estoque.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        System.out.println("Welcome to Stock System");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data.");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());

        product.setPrice(1200);
        System.out.println("Update price: $" + product.getPrice());

        System.out.println("Update quantity in stock: " + product.getQuantityInStock());

        System.out.println("Product data: " + product);

        System.out.println("Do you want to add products? ");
        System.out.print("Enter the number of products to add: ");
        int quantity = sc.nextInt();

        product.addProducts(quantity);
        System.out.println(product);

        System.out.println("Do you want to remove products? ");
        System.out.print("Enter the number of products to remove: ");
        quantity = sc.nextInt();
        sc.nextLine();

        product.removeProducts(quantity);
        System.out.println(product);

        sc.close();
    }
}
