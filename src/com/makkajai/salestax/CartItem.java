package com.makkajai.salestax;

public class CartItem {
    private final Product product;
    private final int quantity;
    private final double totalPrice;
    private final double totalTax;

    public CartItem(Product product, int quantity, double totalPrice, double totalTax) {
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.totalTax = totalTax;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public double getTotalPrice() { return totalPrice; }
    public double getTotalTax() { return totalTax; }
}
