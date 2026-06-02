package org.example.OOP.Encapsulation.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class App {

    private Console console = new Console();
    private LibraryService library = new LibraryService();

    public void run() {
        console.showWelcome();

        String userName = console.readUserName();
        var user = new User("1",userName);

        while (true) {
            String option = console.readOption();

            switch (option) {
                case "1":
                    borrowFlow(user);
                    break;
                case "2":
                    returnFlow(user);
                    break;
                default:
                    console.showInvalidOption();
            }

            String cont = console.readContinue();

            if (cont.equalsIgnoreCase("N")) {
                console.showGoodbye();
                break;
            }
        }
    }

    private void borrowFlow(User user) {

        console.showBooksHeader();

        for (Book book : library.getBooks()) {
            System.out.println(book.getIsbn() + " - " + book.getTitle());
        }

        String id = console.readBookId();
        Book book = library.findBookById(id);

        if (user.borrowBook(book)) {
            console.showSuccessBorrow();
        } else {
            console.showErrorBorrow();
        }
    }

    private void returnFlow(User user) {

        if (user.getBooks().isEmpty()) {
            console.showNoBooks();
            return;
        }

        console.showUserBooksHeader();

        for (Book book : user.getBooks()) {
            System.out.println(book.getIsbn() + " - " + book.getTitle());
        }

        String id = console.readBookId();
        Book book = library.findBookById(id);

        if (user.returnBook(book)) {
            console.showSuccessReturn();
        } else {
            console.showErrorReturn();
        }
    }
}
