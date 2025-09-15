package com.makkajai.salestax;

import java.util.ArrayList;
import java.util.List;

public class ReceiptGenerator {
    public static Receipt generateReceipt(List<String> inputLines) {
        List<CartItem> items = new ArrayList<>();
        double totalTaxes = 0.0;
        double totalCost = 0.0;

        for (String line : inputLines) {
            Product product = InputParser.parseProduct(line);
            int quantity = InputParser.parseQuantity(line);

            double tax = TaxCalculator.calculateTax(product) * quantity;
            double finalPrice = (product.getPrice() * quantity) + tax;

            CartItem cartItem = new CartItem(product, quantity, finalPrice, tax);
            items.add(cartItem);

            totalTaxes += tax;
            totalCost += finalPrice;
        }

        return new Receipt(items, totalTaxes, totalCost);
    }
}
