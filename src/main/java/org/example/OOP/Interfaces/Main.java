package org.example.OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2026(100_000);
        // var report = new TaxReport(calculator);
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2029());

        // report.setCalculator(new TaxCalculator2029());
        // report.show();
    }
}
