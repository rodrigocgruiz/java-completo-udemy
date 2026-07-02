package estoque.entities;

public class Product {
    String name;
    private double price;
    private int quantityInStock;

    public Product() {
    }

    public Product(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double totalValueInStack() {
        return price * quantityInStock;
    }

    public void addProducts(int quantity) {
        this.quantityInStock += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantityInStock -= quantity;
    }

    @Override
    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantityInStock
                + " units of "
                + name
                + ", Total: $ "
                + String.format("%.2f", totalValueInStack());
    }
}
