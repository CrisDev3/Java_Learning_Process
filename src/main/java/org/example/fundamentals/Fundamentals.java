package org.example.fundamentals;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Fundamentals {
    public static void main(String[] args) {
        //Variables
        // Variable´s structure: [data type] [varable name] [assignment operator] (value);
        int age = 30;
        System.out.println("Your age is " + age + " years old brotha");

        //Primitive types: We use them to store simple values like ages, names etc.
        byte aByte = 127; // Range -128 to 127 and takes 1 byte (8 bits)
        short aShort = 32000; // Range -32k to 32k and takes 2 bytes
        int aInt = 1_000_000; // -2B to 2B and takes 4 bytes
        long aLong = 3_000_000L; // takes 8 bytes
        float aFloat = 1.1f; // takes 4 bytes
        double aDouble = 1.2; // takes 8 bytes of memory
        char aChar = 'a'; // Any single character and takes 2 bytes
        boolean aBoolean = true; // Range true/false and takes 1 byte

        //Reference characters: We use them to store complex objects like date objects or mail messages
        Date aDate = new Date(); // The new keyword is used to allocate memory for our reference types variables
        System.out.println("La fecha exacta es: " + aDate);

        //Primitive vs reference types
        Point aPoint = new Point(1,1);
        Point aPoint2 = new Point(2,2);
        Point aPoint3 = aPoint; // both variables are storing the same reference
        System.out.println("aPoint contiene la misma referencia que aPont2? " + (aPoint == aPoint2)); //Resultado falso porque son referencias distintas
        System.out.println("aPoint y aPoint3 contienen el mismo contenido? " + aPoint.equals(aPoint3)); // Resultado correcto por contenidos iguales

        // Strings
        String aString = "Hello world";
        System.out.println(aString.startsWith("Hello"));
        System.out.println(aString.contains("lol"));
        System.out.println(aString.indexOf("d"));
        System.out.println(aString.toUpperCase());
        System.out.println(aString.replaceAll("l", "g"));


        // Escape sequences: To be able to print backlahses \ and
        System.out.println("\\"); // To scape a character we add a backlash before
        System.out.println("\"Esto es un texto con comillas dobles\"");
        System.out.println("Hello \"Cristopher\"");
        System.out.println("Hello \n Cris"); // Add a new line in a string
        System.out.println("Hello \t Marlene"); // Add a tab in a string

        // Arrays: This data structure has a fixed value and length, once initialized it cannot change
        // Structure of a array: [Data type] [] [Array name] = new [Data type] [number of items];
        // or [Data type] [] [Array name] = {[value1],[value2]...};
        int[] anArray = new int[3];
        anArray[0] = 1;
        anArray[1] = 2;
        anArray[2] = 3;
        int[] anArray2 = {3, 4, -2};
        System.out.println(anArray2); //This will print [I@37a71e93, this is calculated based in the address of the object in memory
        System.out.println(Arrays.toString(anArray2)); //To print the content of an array we use Arrays.toString()
        Arrays.sort(anArray2); // Ordenar ascendentemente los arreglos de numeros
        System.out.println(Arrays.toString(anArray2));

        // Multidimensional arrays
        // Two dimensional array
        int [][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 1;
        numbers[1][1] = 2;
        numbers[1][2] = 3;
        System.out.println(Arrays.deepToString(numbers));

        //Three dimensional array
        int[][][] numbers2 = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        System.out.println(Arrays.deepToString(numbers2));

        // Constants: To specify that a variable should be a constant we add the keyword final at the beginning
        final float pi = 3.1416F;

        // Arithmetic expressions
//        double result = (double)10/ (double)3;
//        System.out.println(result);

        //Increment and decrement operators (++ and --)
//        int x = 1;
//        int y = ++x; //subfixed
//        System.out.println(x);
//        System.out.println(y); // Results 2 and 2

//        int a = 1;
//        int b = a++; //posfixed
//        System.out.println(a);
//        System.out.println(b); // Results 2 and 1

        // Compound operators: +=, -=, *=, /=
//        x += 2;
//        System.out.println(x);
//        x -= 2;
//        System.out.println(x);
//        x *= 2;
//        System.out.println(x);
//        x /= 2;
//        System.out.println(x);

        // Order of operations: ((), ^, /, *, +, -)
        int suma = (10 + 3) * 2;
        System.out.println(suma);

        //Casting and type conversion
        //Implicit casting: byte > short > int > long, float > double
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);

//        double x = 1.1;
//        double y = x  + 2;
//        System.out.println(y);

        // Explicit casting
//        double x = 1.1;
//        int y = (int)(x + 2);
//        System.out.println(y);

//        byte x2 = 1;
//        short y2 = (short)(x + 2);
//        System.out.println(y2);

        // Type conversion
//        String x = "11";
//        int y = Integer.parseInt(x);
//        System.out.println(y);

//        String x = "1";
//        short y = Short.parseShort(x);
//        System.out.println(y)

//        String x = "1";
//        float y = Float.parseFloat(x);
//        System.out.println(y);

//        String x = "1.1";
//        double y = Double.parseDouble(x) + 2;
//        System.out.println(y);

        // The math class: For performing mathematical operations
//        float x = Math.round(3.157F);
//        System.out.println(x);

//        int x = (int) Math.ceil(1.1F);
//        System.out.println(x);

//        int x = (int) Math.floor(10.9);
//        System.out.println(x);

//        int x = Math.max(1, 5);
//        System.out.println(x);

//        int x = (int)(Math.random() * 300); // El metodo random solo genera numeros entre 0 y 1,si queremos por ejemplo un rango hasta 100 multiplicamos por 100
//        int x = (int) Math.round(Math.random() * 300); // The same as above
//        System.out.println(x);

        //Formatting numbers: For example to show percentages, or prices
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891); //Formatting a number as a currency
//        System.out.println(result);

//        String result = NumberFormat.getPercentInstance().format(0.2); //Formatting a number as a percentage
//        System.out.println(result);

        // The Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero cualquiera: "); // print, para no realizar salto de linea
        int x = scanner.nextInt();
        scanner.nextLine(); // Para limpiar el buffer
        System.out.println("El numero que ingresastes es el " + x);

        System.out.print("Introduce un nombre cualquiera: ");
        String name = scanner.nextLine().trim(); //Trum() para eliminar cualquier espacio en blanco de la entrada
        System.out.println("El nombre que ingresastes es " + name);

        //The next() method only read the next word, if it is a phrase it only stores the firs word, that why we use the nextLine() method




    }
}
