package org.example.controlFlow;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // If the number is divisible by 5 prints Fizz
        // If the number is divisible by 3 prints Buzz
        // If the number is divisible by 5 and 3 prints Fizz Buzz
        // If the number is not divisible by 5 or 3 prints the number
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the fizz buzz game!");
        System.out.print("Introduce a whole number: ");
        int number = scan.nextInt();

        if ((number % 5 == 0) && (number % 3 == 0))
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
