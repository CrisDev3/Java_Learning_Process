package org.example.controlFlow;

import java.util.Scanner;

public class DynamicMultiplicationTable {
    public static void main(String[] args) {
        int baseNumber = 0;
        int limitNumber = 0;
        String input = "";
        boolean flag;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabla de multiplicar dinamica");
        System.out.println("Ingresa los siguientes datos.");

        while (true) {
            flag = false;

            System.out.print("Número: ");
            baseNumber = scanner.nextInt();
            if (baseNumber <= 0) {
                System.out.println("El número base no puede ser cero o negativo, ingreselo nuevamente.");
                continue;
            }

            System.out.print("Ingrese el número limite a multiplicar: ");
            limitNumber = scanner.nextInt();
            scanner.nextLine();

            if (limitNumber <= 0) {
                System.out.println("El número limite no puede ser cero o negativo.");
                continue;
            }

            for (int i = 1; i <= limitNumber; i++) {
                System.out.println(baseNumber + " x "+ i + " = " + baseNumber * i);
            }
            System.out.println();

            while (true) {
                System.out.println("Desea terminar el programa? (S/N)");
                input = scanner.nextLine().toUpperCase().trim();
                if (input.equals("S")) {
                    System.out.println("Gracias por utilizar este programa. Adios.");
                    break;
                }
                else if (input.equals("N")) {
                    flag = true;
                    break;
                }
                else {
                    System.out.println("Ingresa una opcion valida.");
                }
            }
            System.out.println();
            if (flag)
                continue;

            break;
        }
    }

}
