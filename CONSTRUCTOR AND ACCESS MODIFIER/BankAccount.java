public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
}