package org.example.OOP.Encapsulation.BankAccountSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    private Scanner scanner;

    public Console(Scanner scanner) {
        this.scanner = scanner;
    }

    // Output General
    public void showWelcomeMessage() {
        System.out.println("Welcome to the Bank Account Simulator");
    }

    public void showGoodByeMessage() {
        System.out.println("Good bye!");
    }

    public void showExitMessage() {
        System.out.println("\nThank you for using the app. Bye");
    }

    public void showInvalidOption() {
        System.out.println("Please enter a valid option.");
    }

    public void showElectionMessage() {
        System.out.println("Do you want to continue using the app? (S/N)");
    }

    public void printBalance (double balance) {
        System.out.println("\nYour account balance is $" + balance + ".\n");
    }

    public void printTransactions (List<String> transactions) {
        System.out.println();
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println();
    }

    // Success messages
    public void showDepositSuccess(String ownerName, double amount, double balance) {
        System.out.println("\n" + ownerName + " deposited $" + amount + ". Balance: $" + balance);
    }

    public void showWithdrawSuccess(String ownerName, double amount, double balance) {
        System.out.println("\n" + ownerName + " withdrew $" + amount + ". Balance: $" + balance);
    }

    // Errors
    public void showError(String message) {
        System.out.println("Error: " + message);
    }

    // Inputs
    public String getAccountNumber() {
        String accountNumber;
        while (true) {
            System.out.print("Please enter your account number: ");
            accountNumber = scanner.nextLine().trim();
            if (accountNumber.isEmpty()) {
                System.out.println("Please enter a valid account number");
                System.out.println();
                continue;
            }
            System.out.println();
            break;
        }
        return accountNumber;
    }

    public String getOwnerName() {
        String ownerName;
        while (true) {
            System.out.println("Please enter the owner name: ");
            ownerName = scanner.nextLine().trim();
            if (ownerName.isEmpty()) {
                System.out.println("Please enter a valid owner name");
                continue;
            }
            System.out.println();
            break;
        }
        return ownerName;
    }

    public String getOption() {
        String option;
        System.out.println("Select the number of the transaction type.");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. See account balance");
        System.out.println("4. Transactions history");
        System.out.println("5. Exit");
        option = scanner.nextLine().trim();
        return option;
    }

    public double readAmount(String message) {
        double amount;

        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();

            amount = Double.parseDouble(input);

            if (amount <= 0) {
                System.out.println("Amount must be greater than 0.");
                continue;
            }

            return amount;
        }
    }

    public String askContinue() {
        while (true) {
            System.out.println("Do you want to continue using the app? (S/N)");
            String option = scanner.nextLine().trim();

            if (option.equalsIgnoreCase("s") || option.equalsIgnoreCase("n")) {
                return option;
            }

            System.out.println("Please enter a valid option.");
        }
    }
}
