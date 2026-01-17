package org.example.fundamentals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HumanCalculator {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        greet();
        System.out.print("Ingresa el primer número: ");
        float firstNumber = sc.nextFloat();
        System.out.print("Ingresa el segundo número: ");
        float secondNumber = sc.nextFloat();
        sc.nextLine();

        double [] results = calculate(firstNumber, secondNumber);
        showResults(results);
    }

    private static double[] calculate(float firstNumber, float secondNumber) {
        float addResult = firstNumber + secondNumber;
        float subtractResult = firstNumber - secondNumber;
        float multiplyResult = firstNumber * secondNumber;
        float divideResult = firstNumber / secondNumber;
        double [] result = new double[4];
        result[0] = addResult;
        result[1] = subtractResult;
        result[2] = multiplyResult;
        result[3] = divideResult;
        return result;
    }

    private static void showResults(double [] results) {
        System.out.println("\nResultados:");
        System.out.println("Suma: " + results[0]);
        System.out.println("Resta: " + results[1]);
        System.out.println("Multiplicación: " + results[2]);
        System.out.println("División: " +  df.format(results[3]));
    }

    public static void greet() {
        System.out.print("Introduce tu nombre: ");
        String name  = sc.nextLine().trim();
        System.out.println("Hola " + name);
    }

}
