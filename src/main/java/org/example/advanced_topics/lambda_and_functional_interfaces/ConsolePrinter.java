package org.example.advanced_topics.lambda_and_functional_interfaces;

public class ConsolePrinter implements Printer {


    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
