package com.makkajai.salestax;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private final List<ReceiptItem> items;
    private double totalTaxes;
    private double totalAmount;

    public Receipt() {
        this.items = new ArrayList<>();
        this.totalTaxes = 0.0;
        this.totalAmount = 0.0;
    }


    public void printReceipt() {
        for (ReceiptItem item : items) {
            System.out.println(item);
        }
        System.out.println("Sales Taxes: " + String.format("%.2f", totalTaxes));
        System.out.println("Total: " + String.format("%.2f", totalAmount));
    }

    public void addItem(ReceiptItem item) {
        items.add(item);
    }

    public void setTotalTaxes(double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }


}
