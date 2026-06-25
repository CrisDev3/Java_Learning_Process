package org.example.advanced_topics.generics;

public class List {

    //The problem: Code duplication ends up in a no scalable code, this list cant be used with other data types
//    private int[] items = new int[10];
//    private int count;
//
//    public void add(int item) {
//        items[count++] = item;
//    }
//
//    public int get(int index) {
//        return items[index];
//    }

    //The poor solution: List of Objects - it Allows every reference types, but brings up another flaws
    private Object[] items = new Object[10];
    private int count;

    public void add(Object item) {
        items[count++] = item;
    }

    public Object get(int index) {
        return items[index];
    }
}
