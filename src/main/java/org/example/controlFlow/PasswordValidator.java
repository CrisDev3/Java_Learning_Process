package org.example.controlFlow;

import java.util.Scanner;

public class PasswordValidator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String password = "";
        System.out.println("Bienvenido al validador de contraseñas");

        while(true) {
            System.out.print("Ingrese su contraseña: ");
            password = scanner.nextLine().trim();

            if (validatePassword(password))
                break;
        }
        System.out.println("Gracias por usar este programa.");
    }

    public static boolean validatePassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Introduzca una contraseña valida.");
            return false;
        }
        else if (password.length() < 8) {
            System.out.println("Debe contener minimo 8 caracteres");
            return false;
        }
        else if (!hasNumber(password)) {
            System.out.println("Debe contener minimo 1 un número");
            return false;
        }
        else if (!hasUpper(password)) {
            System.out.println("Debe contener minimo una mayuscula");
            return false;
        }
        return true;
    }

    public static boolean hasNumber(String password) {
        for (char l : password.toCharArray()) {
            if (Character.isDigit(l)) return true;
        }
        return false;
    }

    public static boolean hasUpper(String password) {
        for (char l : password.toCharArray()) {
            if (Character.isUpperCase(l)) return true;
        }
        return false;
    }
}
