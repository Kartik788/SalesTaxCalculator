package com.makkajai.salestax;

public class CategoryIdentifier {
    public static Category identifyCategory(String productName) {
        String lower = productName.toLowerCase();
        if (lower.contains("book")) {
            return Category.BOOK;
        } else if (lower.contains("chocolate")) {
            return Category.FOOD;
        } else if (lower.contains("pill")) {
            return Category.MEDICAL;
        } else {
            return Category.OTHER;
        }
    }

    public static boolean isImported(String productName) {
        return productName.toLowerCase().contains("imported");
    }
}
