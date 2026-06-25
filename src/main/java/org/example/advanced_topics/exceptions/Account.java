package org.example.advanced_topics.exceptions;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float balance) throws IOException {
        //throwing exceptions (Unchecked exceptions)
//        if (value <= 0)
//            throw new IllegalArgumentException();

        /*To throw a checked exception, we have to indicate the caller of this method
        that thjs may throw a checked exception, in this case an IOExeption. In order to
        do that we have to use the throws key word followed by the type of exception
        * */
        if (balance <= 0)
            throw new IOException();
        this.balance += balance;
        System.out.println("deposit called");
    }

    public void withdraw(float value) throws AccountException {
        if (value > balance)
            throw new AccountException(new InsufficientFundsException());
    }
}
