package org.example.advanced_topics.exceptions;

// We need to decide if its a checked or unchecked exception
// Checked -> Exception
// Unchecked (runtime) -> RuntimeException
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
