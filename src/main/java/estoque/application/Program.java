package estoque.application;

import estoque.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = "start";

        System.out.println("Welcome toStock System");

        while (!option.equalsIgnoreCase("exit")) {
            Product product = new Product();

            System.out.println("Enter product data or 'exit' to finish system: ");
            System.out.print("Name: ");
            product.name = sc.nextLine();

            if (product.name.equalsIgnoreCase("exit")) {
                option = "exit";
                break;
            }

            System.out.print("Price: ");
            product.price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Quantity in Stock: ");
            product.quantityInStock = sc.nextInt();
            sc.nextLine();

            System.out.println("Do you want to add or remove products? (add/remove) or exit: ");
            String action = sc.nextLine();

            if (action.equalsIgnoreCase("exit")) {
                option = "exit";
                break;
            }else if (action.equalsIgnoreCase("add")) {
                System.out.print("Enter the number of products to add: ");
                int quantity = sc.nextInt();
                sc.nextLine();

                product.addProducts(quantity);
                System.out.println(product);

            }else if (action.equalsIgnoreCase("remove")) {
                System.out.print("Enter the number of products to remove: ");
                int quantity = sc.nextInt();
                sc.nextLine();

                product.removeProducts(quantity);
                System.out.println(product);
            }
        }
        sc.close();
    }
}
