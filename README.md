# Exceptional-Vending-Machine

A Java vending machine simulation demonstrating object-oriented
programming, custom exception handling, and file I/O.


## Features


- **Item Management**: Add, restock, and track inventory
- **Purchase System**: Insert money, select items, receive change
- **Custom Exceptions**: Specific error handling for common scenarios
- **File Persistence**: Load/save inventory from CSV files


## Project Structure


```
src/
├── Item.java                    # Product representation
├── VendingMachine.java          # Core logic
├── VendingMachineDriver.java    # Interactive interface
├── VendingMachineTester.java    # Unit tests
├── ItemNotFoundException.java
├── OutOfStockException.java
└── InsufficientFundsException.java
```


## How to Run


```bash
# Compile all files
javac *.java


# Run tests
java VendingMachineTester


# Run interactive mode
java VendingMachineDriver
```


## What I Learned


- Designing classes with proper encapsulation
- Creating and throwing custom exceptions
- Reading/writing files with Scanner and PrintWriter
- Writing comprehensive unit tests


## Author
Abhi Mundas
