package org.example.OOP.inheritance;

// The "this" keyword it´s used to make a reference to the current object field.
public class TextBox extends UIControl {
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
