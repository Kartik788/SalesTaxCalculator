package com.makkajai.salestax;


import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private final List<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public double getTotalTaxes() {
        return items.stream().mapToDouble(CartItem::getTotalTax).sum();
    }

    public double getTotalAmount() {
        return items.stream().mapToDouble(CartItem::getTotalPriceWithTax).sum();
    }

    public void printReceipt() {
        items.forEach(System.out::println);
        System.out.println("Sales Taxes: " + String.format("%.2f", getTotalTaxes()));
        System.out.println("Total: " + String.format("%.2f", getTotalAmount()));
    }
}
