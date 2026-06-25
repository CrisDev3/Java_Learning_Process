package org.example.OOP.Interfaces;

public class TaxReport {

    private TaxCalculatorRepository calculator;

    // Constructor injection
//    public TaxReport(CanTaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    // method injection
    public void show(TaxCalculatorRepository calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // Setter injection
//    public void setCalculator(CanTaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
