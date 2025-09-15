package com.makkajai.salestax;

public class ReceiptPrinter {
    public static void printReceipt(Receipt receipt) {
        for (CartItem item : receipt.getItems()) {
            System.out.printf("%d %s: %.2f%n",
                    item.getQuantity(),
                    item.getProduct().getName(),
                    item.getTotalPrice());
        }
        System.out.printf("Sales Taxes: %.2f%n", receipt.getTotalTaxes());
        System.out.printf("Total: %.2f%n", receipt.getTotalCost());
    }
}
