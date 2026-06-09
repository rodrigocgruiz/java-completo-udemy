package estoque.entities;

public class Product {
    public String name;
    public double price;
    public int quantityInStock;

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
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStack());
    }
}
