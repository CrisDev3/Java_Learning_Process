package org.example.controlFlow;

import java.util.Scanner;

public class SmartCounter {
    public static void main(String[] args) {
        int increment = 0;
        int initialNumber = 0;
        int finalNumber = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al contador inteligente.");
        while (true) {
            System.out.print("Ingrese el numero inicial: ");
            initialNumber = scanner.nextInt();
            if (initialNumber < 0) {
                System.out.println("El numero inicial es invalido.");
                continue;
            }

            System.out.print("Ingrese el numero final: ");
            finalNumber = scanner.nextInt();
            if (finalNumber <= 0) {
                System.out.println("El número final es invalido.");
                continue;
            }
            if (initialNumber == finalNumber) {
                System.out.println("El numero inicial y el final deben ser diferentes");
                continue;
            }
            else if (initialNumber > finalNumber) {
                System.out.println("Configuracion inválida.");
                continue;
            }

            System.out.println("Ingrese el incremento deseado: ");
            increment = scanner.nextInt();
            if (increment <= 0) {
                System.out.println("El incremento es invalido.");
                continue;
            }

            for (int i = initialNumber; i <= finalNumber; i += increment ) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
            System.out.println("Gracias por utilizar este programa! Adios.");
            break;
            
        }
    }
}
