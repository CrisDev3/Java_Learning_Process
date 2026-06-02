package org.example.debugging;

public class Debugging {
    public static void main(String[] arg) {
        // When we build java applications we encounter 2 types of errors:
        // Compile time (Syntax errors) errors: prevents us from compile the application
        // Run time errors: This are more complicated to discover, in order to do that, we use the Debugger

        // Example of debug
        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");
    }

    public static void printNumbers(int limit) {
        for (int i = 0; i <= limit; i++)
            System.out.println(i);
    }
}
