package org.example.OOP.Encapsulation.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books = new ArrayList<Book>();

    public LibraryService() {
        books.add(new Book("Como ganar amigos e influir sobre las personas", "Carneige", "1"));
        books.add(new Book("La biblia", "Dios", "2"));
        books.add(new Book("Mero cristianismo", "C.S. Lewis", "3"));
        books.add(new Book("Mas que un carpintero", "Ferguzon", "4"));
        books.add(new Book("Harry Potter 1", "J.K. Rowling", "8"));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book findBookById(String id) {
        for (Book book : books) {
            if (book.getIsbn().equals(id)) {
                return book;
            }
        }
        return null;
    }
}
