package org.example.advanced_topics.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() throws IOException, InsufficientFundsException, AccountException {
        // Checked Exceptions
        // Handling exceptions

        // Better way of releasing external resources without the finally block
        // Try-with-resources statement
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");
                ) {
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
        catch (IOException | ParseException ex) {
            System.out.println("Could not read data");
            System.out.println(ex.getMessage());
        }
        // Ugly way of handling external resources with a finally block
//        finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException ex) {
//                    System.err.println("Error encounteres: " + ex.getMessage());
//                }
//            }
//        }
        //The same as
//        catch (FileNotFoundException ex) {
//            System.out.println("file does not exist.");
//        }
//        catch (IOException ex) {
//            System.out.println("Could not read data.");
//        }
//        catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("file opened");

        //Unchecked Exceptions
        // sayHello(null);

        // Throwing exceptions
        var account = new Account();
        try {
            account.deposit(10 ); // This method may throw an IOException
            account.withdraw(500);
        } catch (Throwable e) {
            System.out.println("Logging");
            throw e;
        }
    }

//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }

}
