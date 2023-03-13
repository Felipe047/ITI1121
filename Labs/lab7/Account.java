public class Account {
    private double balance;

    Account() {
        this.balance = 0;
    }

    public void deposit(double add) {
        this.balance += add;
    }

    public void withdraw(double less) throws NotEnoughMoneyException {
        if (this.balance < less) {
            throw new NotEnoughMoneyException(this.balance, less);
        } else {
            this.balance -= less;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return balance;
    }
}
