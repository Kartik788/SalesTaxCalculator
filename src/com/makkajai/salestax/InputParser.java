package com.makkajai.salestax;

public class InputParser {
    public static Product parseProduct(String line) {

        String[] parts = line.split(" at ");
        double price = Double.parseDouble(parts[1]);

        String[] tokens = parts[0].split(" ", 2);
        int quantity = Integer.parseInt(tokens[0]);
        String name = tokens[1];

        boolean imported = name.contains("imported");

        ProductCategory category = ProductCategory.OTHER;
        if (name.contains("book")) {
            category = ProductCategory.BOOK;
        } else if (name.contains("chocolate")) {
            category = ProductCategory.FOOD;
        } else if (name.contains("pill")) {
            category = ProductCategory.MEDICAL;
        }

        return new Product(name, price, imported, category);
    }

    public static int parseQuantity(String line) {
        return Integer.parseInt(line.split(" ")[0]);
    }
}
