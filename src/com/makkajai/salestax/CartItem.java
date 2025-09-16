package com.makkajai.salestax;

public class CartItem {
    private final Product product;
    private final int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalTax() {
        return product.calculateTotalTax(quantity);
    }

    public double getTotalPriceWithTax() {
        return product.calculateTotalPriceWithTax(quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return product.getName();
    }

    @Override
    public String toString() {
        return quantity + " " + product.getName() + ": " +
                String.format("%.2f", getTotalPriceWithTax());
    }
}
