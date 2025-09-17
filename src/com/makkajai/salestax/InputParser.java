package com.makkajai.salestax;


public class InputParser {
    public static CartItem parseInputLine(String line) {
        String[] parts = line.split(" at ");
        double price = Double.parseDouble(parts[1]);

        String quantityAndName = parts[0];
        int firstSpace = quantityAndName.indexOf(" ");
        int quantity = Integer.parseInt(quantityAndName.substring(0, firstSpace));
        String name = quantityAndName.substring(firstSpace + 1);

        Category category = CategoryIdentifier.identifyCategory(name);
        boolean imported = CategoryIdentifier.isImported(name);

        Product product = new Product(name, price, category, imported);
        return new CartItem(product, quantity);
    }
}
