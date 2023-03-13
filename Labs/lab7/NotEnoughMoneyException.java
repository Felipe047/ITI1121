public class NotEnoughMoneyException extends IllegalArgumentException {
    private double missingAmount;
    private double withdraw;
    private double amount;

    NotEnoughMoneyException(double current, double withdraw) {
        this.withdraw = withdraw;
        this.missingAmount = -1 * (current - withdraw);
        this.amount = current;
    }

    @Override
    public String toString() {
        return "NotEnoughMoneyException";
    }

    @Override
    public String getMessage() {
        return "you have not enought money to witdraw " + this.withdraw +"$";
    }

    public double getMissingAmount() {
        return missingAmount;
    }

    public double getAmount() {
        return missingAmount + amount;
    }
}
