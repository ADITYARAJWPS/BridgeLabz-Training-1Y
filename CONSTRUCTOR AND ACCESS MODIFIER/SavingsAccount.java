public class SavingsAccount extends BankAccount {

    public void display() {
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        // balance is private → not directly accessible
    }
}