package org.example.controlFlow;

import java.util.Random;
import java.util.Scanner;

public class NumberRiddle {
    public static void main(String[] args) {
        int attemptsNumber = 0;
        int randomNumber = 0;
        int inputNumber = 0;
        boolean flag;
        String desition = "";

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego adivina el número!");
        System.out.println("Rango de digitos (0 al 100)\n");

        while (true) {
            randomNumber = random.nextInt(101);
            flag = false;

            while (!(inputNumber == randomNumber)) {
                System.out.print("Digite un número: ");
                inputNumber = scanner.nextInt();
                scanner.nextLine();

                if (!(inputNumber < 0 || inputNumber > 100))
                    attemptsNumber++;

                if (inputNumber < 0 || inputNumber > 100) {
                    System.out.println("Introduce un número valido.");
                    continue;
                }

                if (inputNumber == randomNumber) {
                    System.out.println("Haz acertado en " + attemptsNumber + " intentos! Felicidades.");
                    break;
                }
                else if (inputNumber > randomNumber)
                    System.out.println("Muy alto, intentelo de nuevo.");
                else
                    System.out.println("Muy bajo, intentelo de nuevo.");

            }
            System.out.println();

            while (true) {
                System.out.println("Deseas seguir usando esta aplicación? (S/N): ");
                desition = scanner.nextLine().toUpperCase().trim();
                if (desition.equals("S")) {
                    flag = true;
                    break;
                }
                else if (desition.equals("N")) {
                    System.out.println("Adios!");
                } else {
                    System.out.println("Digite su respuesta nuevamente.");
                    continue;
                }
                break;
            }

            if (flag)
                continue;

            break;
        }

    }
}
