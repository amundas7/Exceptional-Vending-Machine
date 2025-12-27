import java.util.ArrayList;
/*
This class builds the vending machine and its helper methods
Author: Abhi Mundas
 */
public class VendingMachine {
    private ArrayList<Item> inventory; // array list of items 
    private double moneyInput; // money inserted into the vending machine
    private double totalRevenue; // total revenue earned from vending machine

    public VendingMachine() {
        inventory = new ArrayList<>();
        moneyInput = 0.0;
        totalRevenue = 0.0;
    }

    public void addItem(Item item) throws IllegalArgumentException {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        inventory.add(item); // adds the item to the inventory
    }

    /*
    findItem() is a private helper that helps the user find an item 
    in the inventory
     */
    private Item findItem(String name) throws ItemNotFoundException {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        throw new ItemNotFoundException("Item not found: " + name);
    }

    public void insertMoney(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        moneyInput += amount;
    }

    public double purchaseItem(String name) throws ItemNotFoundException, OutOfStockException, InsufficientFundsException {
        // Find the item using the findItem helper method
        Item item = findItem(name); 

        //check if item is in stock
        if (item.getQuantity() <= 0) {
            throw new OutOfStockException(name + " is out of stock");
        }

        // check if user input enough money
        if (moneyInput < item.getPrice()) {
            double moneyNeeded = item.getPrice() - moneyInput;
            throw new InsufficientFundsException(name, moneyNeeded);
        }

        // complete purchase
        item.reduceQuantity();
        double change = moneyInput - item.getPrice();
        totalRevenue += item.getPrice();
        moneyInput = 0.0;
        return change;

    }

    public double cancelTransaction() {
        double refund = moneyInput;
        moneyInput = 0.0;
        return refund;
    }

    public void displayInventory() {
        for (Item item : inventory) {
            System.out.print(item);
        }
    }


}
