package org.example.advanced_topics.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws AccountException {
        try {
            ExceptionsDemo.show();
        } catch (InsufficientFundsException | IOException e) {
            System.out.println("An unexpected error occured");
        }
    }
}
