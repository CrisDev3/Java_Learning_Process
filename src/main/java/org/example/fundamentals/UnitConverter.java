package org.example.fundamentals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        final int OFFSET = 32;
        final int RATIO = 5;
        final int SCALE_FACTOR = 9;
        final double AVOIRDUPOIS = 2.20462F;
        final double KG_FACTOR = 0.45359237F;
        final double KM_TO_MILES_FACTOR = 0.62137119F;
        final double MILES_TO_KM_FACTOR = 1.609344F;

        int option = 0;
        double result = 0;
        double temp = 0;
        double weight = 0;
        double distance = 0;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Bienvenido al conversor de unidades");

        while (true) {
            System.out.println("Porfavor, escribe la opcion que deseas usar");
            System.out.println("1. Convertir temperatura");
            System.out.println("2. Convertir peso");
            System.out.println("3. Convertir distancia");
            option = scanner.nextInt();
            if (option < 1 || option > 3){
                System.out.println("Introduzca una opción correcta");
                continue;
            }
            System.out.println();
            break;
        }

        switch (option){
            case 1:
                while (true) {
                    System.out.println("Selecciona la conversión de temperatura que desee");
                    System.out.println("1. Fahrenheit a Celsius");
                    System.out.println("2. Celsius a Fahrenheit");
                    option = scanner.nextInt();
                    if (option < 1 || option > 2){
                        System.out.println("Introduzca una opción correcta");
                        continue;
                    }

                    if (option == 1) {
                        System.out.print("Ingrese la temperatura: ");
                        temp = scanner.nextDouble();
                        result = ((temp - OFFSET) * RATIO)/SCALE_FACTOR;
                        System.out.println("El resultado es: " + df.format(result) + "° Celsius");
                    }
                    else if (option == 2) {
                        System.out.print("Ingrese la temperatura: ");
                        temp = scanner.nextDouble();
                        result = (temp * 9 / 5) + OFFSET;
                        System.out.println("El resultado es: " + df.format(result) + "° Fahrenheit");
                    }
                    System.out.println();
                    break;
                }
                break;
            case 2:
                while (true) {
                    System.out.println("Selecciona la conversión de peso que desee");
                    System.out.println("1. Kilogramos a libras");
                    System.out.println("2. Libras a kilogramos");
                    option = scanner.nextInt();
                    if (option < 1 || option > 2){
                        System.out.println("Introduzca una opción correcta");
                        continue;
                    }

                    if (option == 1) {
                        while (true) {
                            System.out.print("Ingrese el peso: ");
                            weight = scanner.nextDouble();
                            if (weight <= 0) {
                                System.out.println("Introduzca un peso mayor a 0");
                                continue;
                            }
                            break;
                        }
                        result = weight * AVOIRDUPOIS;
                        System.out.println("El resultado es: " + df.format(result) + " libras");
                    }

                    if (option == 2) {
                        while (true) {
                            System.out.print("Ingrese el peso: ");
                            weight = scanner.nextDouble();
                            if (weight <= 0) {
                                System.out.println("Introduzca un peso mayor a 0");
                                continue;
                            }
                            break;
                        }
                        result = weight * KG_FACTOR;
                        System.out.println("El resultado es: " + df.format(result) + " kilogramos");
                    }

                    System.out.println();
                    break;
                }
                break;
            case 3:
                while (true) {
                    System.out.println("Selecciona la conversión de distancia que desee");
                    System.out.println("1. Kilometros a millas");
                    System.out.println("2. Millas a kilometros");
                    option = scanner.nextInt();
                    if (option < 1 || option > 2) {
                        System.out.println("Introduzca una opción correcta");
                        continue;
                    }

                    if (option == 1) {
                        while (true) {
                            System.out.println("Ingrese la distancia: ");
                            distance = scanner.nextDouble();
                            if (distance <= 0) {
                                System.out.println("Introduzca una distancia mayor a 0");
                                continue;
                            }
                            break;
                        }
                        result = distance * KM_TO_MILES_FACTOR;
                        System.out.println("El resultado es: " + df.format(result) + " millas");
                    }

                    if (option == 2) {
                        while (true) {
                            System.out.println("Ingrese la distancia: ");
                            distance = scanner.nextDouble();
                            if (distance <= 0) {
                                System.out.println("Introduzca una distancia mayor a 0");
                                continue;
                            }
                            break;
                        }
                        result = distance * MILES_TO_KM_FACTOR;
                        System.out.println("El resultado es: " + df.format(result) + " kilometros");
                    }

                    System.out.println();
                    break;
                }
                break;
        }

        System.out.println("Gracias por usar el conversor de unidades");
    }
}
