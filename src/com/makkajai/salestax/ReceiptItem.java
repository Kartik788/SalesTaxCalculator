package com.makkajai.salestax;

public class ReceiptItem {
    private final String name;
    private final int quantity;
    private final double totalPriceWithTax;

    public ReceiptItem(String name, int quantity, double totalPriceWithTax) {
        this.name = name;
        this.quantity = quantity;
        this.totalPriceWithTax = totalPriceWithTax;
    }

    @Override
    public String toString() {
        return quantity + " " + name + ": " + String.format("%.2f", totalPriceWithTax);
    }
}
