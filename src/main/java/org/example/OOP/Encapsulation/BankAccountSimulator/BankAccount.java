package org.example.OOP.Encapsulation.BankAccountSimulator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private List<String> transactionsHistory = new ArrayList<>();

    public BankAccount(String accountNumber, String ownerName) {
        setAccountNumber(accountNumber);
        setOwnerName(ownerName);
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;

        this.balance += amount;

        transactionsHistory.add(amount + " was deposited into account " + accountNumber + " on " + LocalDateTime.now());
        return  true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) return false;

        this.balance -= amount;

        transactionsHistory.add(amount + " was withdrawn from bank account " + accountNumber + " on " + LocalDateTime.now());
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public List<String> getTransactionsHistory() {
        return transactionsHistory;
    }

    private void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty())
            throw new IllegalArgumentException("Account number cannot be empty");
        this.accountNumber = accountNumber;
    }

    private void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isEmpty())
            throw new IllegalArgumentException("Owner name cannot be empty");
        this.ownerName = ownerName;
    }

}
