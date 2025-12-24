/*
This class creates a custom exception for when an item is not found by extending the Exception class
It has a constructor that passes the message to the parent class, which stores it
Author: Abhi Mundas
 */
public class ItemNotFoundException extends Exception{
    public ItemNotFoundException(String message) {
        super(message);
    }
}
