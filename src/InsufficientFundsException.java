public class InsufficientFundsException extends Exception{
    private double amountNeeded;
    public InsufficientFundsException(String message, double amountNeeded) {
        super(message);
        this.amountNeeded = amountNeeded;
    }

    public double getAmountNeeded() {
        return this.amountNeeded;
    }
}
