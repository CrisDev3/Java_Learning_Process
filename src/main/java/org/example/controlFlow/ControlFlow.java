package org.example.controlFlow;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        // Comparison operators (==)
//        int x = 1;
//        int y = 2;
//        System.out.println("Tienen el mismo contenido las 2 variables? "+ (x == y));

        // Logical operators (and &&, or ||, not !)
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println("Esta caliente el agua? " + isWarm);
//
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println("The candidate is eligigle? " + isEligible);

        // If statements: Allows a program make decisions
        int temp = 10;
        if (temp > 30)
            System.out.println("It´s a hot day \nDrink a plenty of water");
        else if (temp >= 20)
            System.out.println("It´s a nice day");
        else
            System.out.println("It´s cold");

        // Simplifying if statements
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000); // Don´t need to use if statements in cases like this one


        // Ternary operator: Very helpful for 2 option problems like this one
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

        // Switch statements
        int role = 1;

        switch (className) {
            case "First":
                System.out.println("Usted fue designado a primera clase");
                break;
            default:
                System.out.println("Usted fue desifnado en clase economica");
        }

        switch (role) {
            case 1:
                System.out.println("Eres un administrador");
                break;
            case 2:
                System.out.println("Eres un cliente");
                break;
            default:
                System.out.println("Eres un invitado");
        }

        // For loop: It´s better to use a for loop in situations where we already kno how many iterations have to be done
        for (int i = 1; i <= 5; i++) {
            String iteracion = i == 1 ? "Probando un for loop " + i + " vez" : "Probando un for loop " + i + " veces";
            System.out.println(iteracion);
        }

        // While loops: Better for situations where we don´t know how many times a process has to repeat
//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//
//        while (!input.equalsIgnoreCase("quit")) {
//            System.out.print("Input: ");
//            input = scanner.nextLine().toLowerCase();
//            System.out.println(input);
//        }

        // Do-While loop: THis type of loop gets executed at leat one time
        // This type of loop are rarely used
//        do {
//            System.out.print("Input: ");
//            input = scanner.nextLine().toUpperCase();
//
//        } while (!input.equalsIgnoreCase("quit"));

        // Break and continue: The break statement terminates a loop and a continue statement moves control to the beginning of the loop
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Input: ");
            input = scanner.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("pass"))
                continue;
            if (input.equalsIgnoreCase("quit"))
                break;
            System.out.println(input);
        }

        // For each loop: It´s used to iterate over arrays or collections
        // A "downside" of this type of loop is that only iterates forward, it cannot iterate from the end to the beginning
        String[] fruits = {"Kiwi", "Mango", "Pineaple"};

        for (String fruit: fruits)
            System.out.println("I like " + fruit +"s");
    }
}
