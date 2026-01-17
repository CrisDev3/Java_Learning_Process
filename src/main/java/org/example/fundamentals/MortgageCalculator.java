package org.example.fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTHS_IN_A_YEAR = 12;
    final static byte PERCENT = 100;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int principal = (int)readNumber("Principal: ", 1000, 1_000_000);
        double annualInterestRate = readNumber("Annual Interest Rate: ", 0, 30);
        byte period = (byte)readNumber("Period (Years): ", 0, 30);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(calculateMortgage(principal, annualInterestRate, period));
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted + "\n");
        paymentSchedule(principal, annualInterestRate, period);
    }

    public static double calculateMortgage(
            int principal,
            double annualInterest,
            int period) {

        double montlyInterest = (annualInterest / PERCENT) / MONTHS_IN_A_YEAR;
        short numberOfPayments = (short) (period * MONTHS_IN_A_YEAR);
        return principal
                * ((montlyInterest * Math.pow((1 + montlyInterest), numberOfPayments)))
                / (Math.pow((1 + montlyInterest), numberOfPayments) - 1);
    }

    public static double readNumber(
            String prompt,
            double min,
            double max) {
        double value = 0;
        while (true) {
            System.out.print(prompt);
            value = sc.nextDouble();
            if (value < min || value > max) {
                System.out.println("Enter a number between " + min + "  and " + max + ".");
                continue;
            }
            System.out.println();
            break;
        }
        return value;
    }

    public static void paymentSchedule(
            int principal,
            double annualInterest,
            int period) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        double montlyInterest = (annualInterest / PERCENT) / MONTHS_IN_A_YEAR;
        short numberOfPayments = (short) (period * MONTHS_IN_A_YEAR);

        System.out.println("PAYMENT SCHEDULE\n-----------------");
        for (int i = 1; i <= numberOfPayments; i++) {
            double remainingBalance = principal * ((Math.pow((1 + montlyInterest), numberOfPayments) - Math.pow((1 + montlyInterest), i))
                    / (Math.pow((1 + montlyInterest), numberOfPayments) - 1));
            System.out.println(numberFormat.format(remainingBalance));
        }
    }


}
