package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}

