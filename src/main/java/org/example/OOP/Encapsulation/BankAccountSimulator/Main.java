package org.example.OOP.Encapsulation.BankAccountSimulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var console = new Console(scanner);
        var service = new BankAccountService(console);

        var app = new App(console, service);
        app.run();
        }
    }

