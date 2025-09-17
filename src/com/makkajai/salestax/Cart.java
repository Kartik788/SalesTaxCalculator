package com.makkajai.salestax;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CartItem> items;

    // Empty constructor initializing the items list
    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        CartItem cartItem = new CartItem(product, quantity);
        items.add(cartItem);
    }

    public List<CartItem> getItems() {
        return new ArrayList<>(items);
    }
}
