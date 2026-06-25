package org.example.OOP;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // Static field
    public static int numberOfEmployees;

    // Constructors is a special method that is called when we create a new object.
    // The job of the default constructor that java creates automatically if we don´t create one is to initialize our fields to our default values.
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    // Constructor overloading: The same principle, constructors are methods too, so they can be overloaded
    public Employee(int baseSalary) {
        this(baseSalary, 0); // here the "this" keyword makes reference to the other constructor
        numberOfEmployees++;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    // Method overloading: Creating different implementations of the same method with different parameters
    // We don´t have to abuse of this technic because it makes our code ugly and hard to understand
    public int calculateWage(){
        return baseSalary;
        // or
        // return calculateWage(0);
    }

    // Static method
    public static void printNumberOfEmployees() {
        System.out.println("Number of employees: " + numberOfEmployees);
    }


    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be cero or less.");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be cero or less.");
        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
