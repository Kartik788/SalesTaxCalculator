package com.makkajai.salestax;

public class Product {
    private final String name;
    private final double basePrice;
    private final Category category;
    private final boolean imported;

    public static final double BASIC_SALES_TAX = 0.10;
    public static final double IMPORT_DUTY = 0.05;

    public Product(String name, double basePrice, Category category, boolean imported) {
        this.name = name;
        this.basePrice = basePrice;
        this.category = category;
        this.imported = imported;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isImported() {
        return imported;
    }

    // Tax for ONE unit
    public double calculateTaxForOne() {
        double tax = 0.0;
        if (category.isTaxable()) {
            tax += basePrice * BASIC_SALES_TAX;
        }
        if (imported) {
            tax += basePrice * IMPORT_DUTY;
        }
        return roundTax(tax);
    }

    // Price of ONE unit including tax
    public double getPriceWithTaxForOne() {
        return basePrice + calculateTaxForOne();
    }

    // Tax for MULTIPLE quantities (applies rounding per item)
    public double calculateTotalTax(int quantity) {
        return calculateTaxForOne() * quantity;
    }

    // Price for MULTIPLE quantities (applies rounding per item)
    public double calculateTotalPriceWithTax(int quantity) {
        return getPriceWithTaxForOne() * quantity;
    }

    // Utility method: round up to nearest 0.05
    private double roundTax(double tax) {
        return Math.ceil(tax * 20.0) / 20.0;
    }
}
