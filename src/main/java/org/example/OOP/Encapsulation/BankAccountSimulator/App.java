package org.example.OOP.Encapsulation.BankAccountSimulator;

public class App {
    private final Console console;
    private final BankAccountService service;

    public App(Console console, BankAccountService service) {
        this.console = console;
        this.service = service;
    }

    public void run() {
        console.showWelcomeMessage();

        String accountNumber = console.getAccountNumber();

        String ownerName = console.getOwnerName();

        var bankAccount = new BankAccount(accountNumber, ownerName);

        principalWhile:
        while (true) {
            String option = console.getOption();

            switch (option) {
                case "1":
                    service.deposit(bankAccount);
                    break;

                case "2":
                    service.withdraw(bankAccount);
                    break;

                case "3":
                    console.printBalance(bankAccount.getBalance());
                    break;

                case "4":
                    console.printTransactions(bankAccount.getTransactionsHistory());
                    break;

                case "5":
                    console.showGoodByeMessage();
                    break principalWhile;

                default:
                    console.showInvalidOption();
            }

            String cont = console.askContinue();

            if (cont.equalsIgnoreCase("n")) {
                console.showGoodByeMessage();
                return;
            }
        }
    }
}
