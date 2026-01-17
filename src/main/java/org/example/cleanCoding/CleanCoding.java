package org.example.cleanCoding;

import java.util.Scanner;

public class CleanCoding {
    public static void main(String[] args) {
        String name = "";

        Scanner sc = new Scanner(System.in);

        // Creating methods: Methods are useful to refactor our code without changing it´s behavior
        System.out.print("What´s your name? type it: ");
        name = sc.nextLine().trim();
        System.out.println(greetMehtod(name));
        ;
    }

    //greet method
    public static String greetMehtod(String name) {
        return "Hello, " + name + "!";
    }

}
