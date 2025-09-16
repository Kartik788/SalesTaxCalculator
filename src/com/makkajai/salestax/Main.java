package com.makkajai.salestax;

import com.makkajai.salestax.CartItem;
import com.makkajai.salestax.Receipt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter items (type 'done' to finish):");
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("done")) {
                break;
            }
            CartItem item = InputParser.parseInputLine(line);
            receipt.addItem(item);
        }

        System.out.println("\n===== Receipt =====");
        receipt.printReceipt();
    }
}
