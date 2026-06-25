package org.example.OOP.inheritance;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        var box1 = new TextBox();
        var box2 = new TextBox();
        var box3 = box2;

        box1.setText("Text Example");
        System.out.println("toString method: " + box1); // The println method implicitly calls the toString method of any object.

        // This method returns a integer based on the memory address of the object
        // The returned number isn´t the address memory itself
        // This hash code, it's used to compare objects
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        System.out.println(box3.hashCode());

        // This method compare 2 object hash codes, if they are equal it returns true and so on
        System.out.println("box1 es igual a box2? " + box1.equals(box2));
        System.out.println("box2 es igual a box3? " + box2.equals(box3));

        // This method returns the String representation of the object
        System.out.println("Representacion en string de box1 = " + box1.toString());

        // Upcasting and Downcasting
//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(textBox);

        // Comparing objects
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        // Polimorphism
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control : controls) {
            control.render();
        }
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
