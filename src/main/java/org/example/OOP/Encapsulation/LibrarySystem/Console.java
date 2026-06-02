package org.example.OOP.Encapsulation.LibrarySystem;

import java.util.Scanner;

public class Console {
    private Scanner scanner = new Scanner(System.in);

    public String readUserName() {
        while (true) {
            System.out.print("Usuario: ");
            String name = scanner.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }

            System.out.println("Ingrese un nombre válido.");
        }
    }

    public String readOption() {
        System.out.println("\n1. Alquilar libro");
        System.out.println("2. Devolver libro");

        return scanner.nextLine().trim();
    }

    public String readBookId() {
        System.out.print("Ingrese ID del libro: ");
        return scanner.nextLine().trim();
    }

    public String readContinue() {
        System.out.print("\n¿Continuar? (S/N): ");
        return scanner.nextLine().trim();
    }

    // Output
    public void showWelcome() {
        System.out.println("Sistema de biblioteca");
    }

    public void showBooksHeader() {
        System.out.println("\nLibros disponibles:");
        System.out.println("ID - Título");
    }

    public void showUserBooksHeader() {
        System.out.println("\nTus libros:");
    }

    public void showSuccessBorrow() {
        System.out.println("Libro reservado correctamente");
    }

    public void showSuccessReturn() {
        System.out.println("Libro devuelto correctamente");
    }

    public void showErrorBorrow() {
        System.out.println("No se pudo reservar el libro");
    }

    public void showErrorReturn() {
        System.out.println("No se pudo devolver el libro");
    }

    public void showNoBooks() {
        System.out.println("No tienes libros.");
    }

    public void showInvalidOption() {
        System.out.println("Opción inválida");
    }

    public void showGoodbye() {
        System.out.println("Adiós!");
    }
}
