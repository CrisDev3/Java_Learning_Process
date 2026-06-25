package org.example.advanced_topics.generics;
// This is a Bounded parameter, it means that it is restricted
// public class GenericList<T extends User & Comparable & Cloneable> {
public class GenericList<T extends User> {

    // To add a constraint or restriction to the generic's Type parameter
    // For example we only want to store numbers in this list, to do that we have to extend the class in the parameter
    // We also can use interfaces, for example this list just can have comparable objects
    // Under the hood the compiler replace all the t with an Object  class if it doesnt has any constraint or with the most left class or interface of the constraint
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
