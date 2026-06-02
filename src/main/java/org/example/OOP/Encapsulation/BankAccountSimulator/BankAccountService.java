package org.example.OOP.Encapsulation.BankAccountSimulator;

public class BankAccountService {
    private final Console console;

    public BankAccountService(Console console){
        this.console = console;
    }

    public void deposit(BankAccount bankAccount) {
        double amount = getValidAmountForDeposit(bankAccount);

        console.showDepositSuccess(
                bankAccount.getOwnerName(),
                amount,
                bankAccount.getBalance()

        );
    }

    public void withdraw(BankAccount bankAccount) {
        double amount = getValidAmountForWithdraw(bankAccount);

        console.showWithdrawSuccess(
                bankAccount.getOwnerName(),
                amount,
                bankAccount.getBalance()
        );
    }

    // Metodo reutilizable para deposit
    public double getValidAmountForDeposit(BankAccount bankAccount) {
        double amount = console.readAmount("Enter the amount to deposit: ");

        while (!bankAccount.deposit(amount)) {
            console.showError("Invalid amount");
            amount = console.readAmount("Enter the amount to deposit: ");
        }
        return amount;
    }

    // Metodo reutilizable para withdraw
    public double getValidAmountForWithdraw(BankAccount bankAccount) {
        double amount = console.readAmount("Enter the amount to withdraw: ");

        while (!bankAccount.withdraw(amount)) {
            console.showError("Invalid amount or insufficient funds");
            amount = console.readAmount("Enter the amount to withdraw: ");
        }
        return amount;
    }
}
