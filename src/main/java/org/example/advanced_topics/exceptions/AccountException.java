package org.example.advanced_topics.exceptions;

public class AccountException extends Exception {

    public AccountException(Exception cause) {
        super(cause);
    }

}
