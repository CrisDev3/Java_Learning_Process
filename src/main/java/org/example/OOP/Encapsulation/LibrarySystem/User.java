package org.example.OOP.Encapsulation.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class User {
private String id;
private String name;
private List<Book> books = new ArrayList<Book>();

public User(String id, String name) {
    setId(id);
    setName(name);
}

private void setName(String name) {
    if (name == null || name.isEmpty())
        throw new IllegalArgumentException("Name cannot be empty");
    this.name = name;
}

private void setId(String id) {
        this.id = id;
    }

public boolean borrowBook(Book book) {
    if (book == null || !book.isAvailable()) {
        return false;
    }

    book.borrowBook();
    books.add(book);
    return true;
}

public boolean returnBook(Book book) {
    if (!books.contains(book)) {
        return false;
    }

    books.remove(book);
    book.returnBook();
    return true;
}

public List<Book> getBooks() { return books; }
}
