package com.makkajai.salestax;

public class TaxCalculator {
    public static double calculateTax(Product product) {
        double tax = 0.0;

        if (product.getCategory() == ProductCategory.OTHER) {
            tax += 0.10 * product.getPrice();
        }


        if (product.isImported()) {
            tax += 0.05 * product.getPrice();
        }


        return roundUpToNearestFiveCents(tax);
    }

    private static double roundUpToNearestFiveCents(double value) {
        return Math.ceil(value * 20.0) / 20.0;
    }
}
