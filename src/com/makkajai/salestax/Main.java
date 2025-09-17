package com.makkajai.salestax;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter items (type 'done' to finish):");
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("done")) {
                break;
            }
            CartItem item = InputParser.parseInputLine(line);
            cart.addItem(item.getProduct(), item.getQuantity());
        }

        TaxService taxService = new TaxService();
        Receipt receipt = taxService.generateReceipt(cart);
        receipt.printReceipt();
    }
}
