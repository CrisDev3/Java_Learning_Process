package org.example.controlFlow;

import java.util.Scanner;

public class BasicValidator {
    public static void main(String[] args){

        int age = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al validador de edad basico");
        while(true) {
            System.out.print("Porfavor ingrese su edad: ");
            age = scanner.nextInt();

            switch ((Object) age) {
                case Integer i when i >= 18 -> System.out.println("Acceso permitido, eres mayor de edad.");

                case Integer i when (i < 18 && i >= 0) -> System.out.println("Acceso denegado, no eres mayor de edad.");

                default -> {
                    System.out.println("Porfavor ingrese una edad valida.");
                    continue;
                }
            }

            System.out.println();
            break;
        }
        System.out.println("Gracias por usar el validador de edad basico.");
    }
}
