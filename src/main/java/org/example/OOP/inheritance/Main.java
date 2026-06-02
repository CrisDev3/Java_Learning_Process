package org.example.OOP.inheritance;

public class Main {

    public static void main(String[] args) {
        var box1 = new TextBox();
        var box2 = new TextBox();
        var box3 = box2;

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
    }
}
