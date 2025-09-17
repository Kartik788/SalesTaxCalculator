package com.makkajai.salestax;

public class TaxService {

    private static final double BASIC_SALES_TAX = 0.10;
    private static final double IMPORT_DUTY = 0.05;

    private double totalTaxes;
    private double totalAmount;

    private double roundTax(double value) {
        return Math.ceil(value * 20.0) / 20.0;
    }

    private double calculateTax(Product product) {
        double tax = 0.0;
        if (product.getCategory().isTaxable()) {
            tax += product.getBasePrice() * BASIC_SALES_TAX;
        }
        if (product.isImported()) {
            tax += product.getBasePrice() * IMPORT_DUTY;
        }
        return roundTax(tax);
    }

    public Receipt generateReceipt(Cart cart) {
        Receipt receipt = new Receipt();
        totalTaxes = 0.0;
        totalAmount = 0.0;

        for (CartItem item : cart.getItems()) {
            double taxPerItem = calculateTax(item.getProduct());
            double totalTaxForItem = taxPerItem * item.getQuantity();
            double itemTotalPrice = (item.getSubtotal()) + totalTaxForItem;

            // Add item to receipt
            ReceiptItem receiptItem = new ReceiptItem(
                    item.getProduct().getName(),
                    item.getQuantity(),
                    itemTotalPrice
            );
            receipt.addItem(receiptItem);

            // Update totals inside TaxService
            totalTaxes += totalTaxForItem;
            totalAmount += itemTotalPrice;
        }

        receipt.setTotalTaxes(totalTaxes);
        receipt.setTotalAmount(totalAmount);

        return receipt;
    }
}
