import java.sql.SQLOutput;
import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        BankAccount account = new BankAccount(0.00, 101134, name);
        System.out.println("Hello, " + name + ". What would you like to do?\n(withdraw/deposit/check balance/check account number/set preferred name/print summary/exit)");
        String input = scan.nextLine();
        while (!(input.equals("withdraw") || input.equals("deposit") || input.equals("check balance") ||
                input.equals("check account number") || input.equals("set preferred name") || input.equals("print summary"))) {
            System.out.println("Please choose from one of the above options.");
            input = scan.nextLine();
        }
        for (int i = 0; i < 100; i++) {
            if (input.equals("exit")) break;
            if (input.equals("withdraw")) {
                System.out.println("How much money would you like to withdraw?");
                double withdrawAmount = scan.nextDouble();
                account.withdraw(withdrawAmount);
            }
            if (input.equals("deposit")) {
                System.out.println("How much money would you like to deposit?");
                double depositAmount = scan.nextDouble();
                account.deposit(depositAmount);
            }
            if (input.equals("check balance")) {
                System.out.println("Your current balance is $" + account.getBalance());
            }
            if (input.equals("check account number")) {
                System.out.println("Your account number is " + account.getAccountNumber());
            }
            if (input.equals("set preferred name")) {
                System.out.println("What would you like your new name to be?");
                String newName = scan.nextLine();
                account.setPreferredName(newName);
            }
            if (input.equals("print summary")) {
                System.out.println("Here is your account summary:");
                System.out.println(account.toString());
            }
            input = "";
            System.out.println("To carry out another action, request one:\n(withdraw/deposit/check balance/check account number/set preferred name/print summary)\nTo exit, say \"exit\".");
            input = scan.nextLine();
        }
    }
}

