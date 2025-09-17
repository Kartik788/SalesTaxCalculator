package com.makkajai.salestax;

public class Product {
    private final String name;
    private final double basePrice;
    private final Category category;
    private final boolean imported;

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
}
