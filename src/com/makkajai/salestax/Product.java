package com.makkajai.salestax;

public class Product {
    private final String name;
    private final double price;
    private final boolean imported;
    private final ProductCategory category;

    public Product(String name, double price, boolean imported, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.imported = imported;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isImported() { return imported; }
    public ProductCategory getCategory() { return category; }
}
