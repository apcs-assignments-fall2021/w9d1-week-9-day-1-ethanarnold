import java.sql.SQLOutput;

public class BankAccount {
    // Instance variables
    private double balance;
    private int accountNumber;
    private String preferredName;

    public BankAccount(double b, int aN, String pN) {
        balance = b;
        accountNumber = aN;
        preferredName = pN;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("You have deposited $" + depositAmount + ". New balance: $" + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        this.balance -= withdrawAmount;
        System.out.println("You have withdrawn $" + withdrawAmount + ". New balance: $" + this.balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getPreferredName() {
        return this.preferredName;
    }

    public void setPreferredName(String name) {
        this.preferredName = name;
        System.out.println("Your new preferred name is " + name + ".");
    }

    @Override
    public String toString() {
        return "Preferred name: " + this.preferredName + "\n" +
               "Balance: $" + this.balance + "\n" +
               "Account Number: " + this.accountNumber + "\n";
    }

}
