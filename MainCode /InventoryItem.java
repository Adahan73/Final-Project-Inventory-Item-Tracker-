import java.io.Serializable;

public class InventoryItem implements Serializable {
    private String id;
    private String name;
    private int quantity;
    private double price;

    public InventoryItem(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Quantity: %d | Price: $%.2f", id, name, quantity, price);
    }
}

