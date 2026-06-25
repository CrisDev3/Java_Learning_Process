package org.example.OOP.Interfaces;

public class TaxCalculator2026 implements TaxCalculatorRepository {
    private double taxableIncome;

    public TaxCalculator2026(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
