/*
This class initializes an item that has a name, price, and quantity
for use in the vending machine

Author: Abhi Mundas
 */
public class Item {
    // instance variables for name, price, and quantity of an item
    // must be private so they cannot be changed outside the program

    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
    // Validate: name cannot be null or empty
    if (name == null || name.trim().isEmpty()) {
        throw new IllegalArgumentException("Name cannot be null or empty");
    }
    // Validate: price must be positive
    if (price <= 0) {
        throw new IllegalArgumentException("Price must be positive");
    }
    // Validate: quantity must be non-negative
    if (quantity < 0) {
        throw new IllegalArgumentException("Quantity cannot be negative");
    }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void reduceQuantity() throws IllegalStateException {
        if (this.quantity <= 0) {
            throw new IllegalStateException("Item out of stock");
        }
        quantity--;
    }

    public void restockAmount(int amount) throws IllegalArgumentException  {
        if (amount <= 0) {
            throw new IllegalArgumentException("Restock amount must be positive");
        }    
    }

    @Override
    public String toString() {
        return String.format("%s ($%.2f) x %d", name, price, quantity);
    }
}