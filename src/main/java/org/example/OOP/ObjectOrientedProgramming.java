package org.example.OOP;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        /* Programming paradigms are ways or styles of writing code
        aa For example procedural paradigm, OOP, functional paradigm etc.
         In object-oriented programming everything is based on objects.
         Objects are units that contains some data (state) and methods (behaviour)
         Some benefits of this paradigm is that in case of a problem in the code
         we don´t have to change all the code, we just have to focus on the code for the object with the problem.
        Another benefit is that once we create an object we can reuse it in other applications
        and the app development turns faster.
        */

        // Classes and everything obout them
        /*
        A class is a blueprint for creating objects
        An object is an instance of a class
        - the data of the object or state are the fields.
        - the behaviour of the object are the methods, and they change the fields of the object.
        A class can has multiple object instances like car1, car2, car3 etc. All these objects are located in different memory locations,
        and can have a separate state.
         */

        // Instantiating an object. The var keyword is used in order that the java compiler determine what´s the data type, based in what´s next
//        var textBox = new TextBox();
//        textBox.setText("Prove me wrong");
//        System.out.println(textBox.text.toUpperCase());
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text.toUpperCase());

        // If we instantiate 2 objects and one of those objects is equal to the other object, both reference variables are referencing the same object in the heap.
        // If I change the state of one of them both will have the same changes.
//        var textBox1 = new TextBox();
//        var textBox2 = textBox1;
//        textBox2.setText("Este es un cambio visible en ambas variables.");
//        System.out.println(textBox1.text.toUpperCase());

        // Improving a procedural programming program, in order to do that we use the encapsulation,
        // That is putting together in the same space (class), all methods and states of a particular thing
        // Getters and setters are used to interact with the object fields as part of the encapsulation principle.
        var employee1 = new Employee(100_000, 0);
        var employee2 = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee2.calculateWage(10);
        System.out.println(wage);
        System.out.println("This is the base salary of this employee: " + employee2.getBaseSalary());

        // Abstraction is reducing complexity by hiding unnecessary thing, one of the benefits is to reduce the coupling.
        // Coupling is the level of dependency between classes. There is no such thing as no coupling, but we have to try to reduce the coupling to the minimum expression

        var browser = new Browser();
        browser.navigate("https://www.google.com");
    }
}
