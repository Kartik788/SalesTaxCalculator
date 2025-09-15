package com.makkajai.salestax;

import java.util.List;

public class Receipt {
    private final List<CartItem> items;
    private final double totalTaxes;
    private final double totalCost;

    public Receipt(List<CartItem> items, double totalTaxes, double totalCost) {
        this.items = items;
        this.totalTaxes = totalTaxes;
        this.totalCost = totalCost;
    }

    public List<CartItem> getItems() { return items; }
    public double getTotalTaxes() { return totalTaxes; }
    public double getTotalCost() { return totalCost; }
}
