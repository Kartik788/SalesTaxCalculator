package com.makkajai.salestax;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> basket1 = Arrays.asList(
                "1 book at 12.49",
                "1 music CD at 14.99",
                "1 chocolate bar at 0.85"
        );

        List<String> basket2 = Arrays.asList(
                "1 imported box of chocolates at 10.00",
                "1 imported bottle of perfume at 47.50"
        );

        List<String> basket3 = Arrays.asList(
                "1 imported bottle of perfume at 27.99",
                "1 bottle of perfume at 18.99",
                "1 packet of headache pills at 9.75",
                "1 imported box of chocolates at 11.25"
        );

        System.out.println("Output 1:");
        ReceiptPrinter.printReceipt(ReceiptGenerator.generateReceipt(basket1));
        System.out.println("\nOutput 2:");
        ReceiptPrinter.printReceipt(ReceiptGenerator.generateReceipt(basket2));
        System.out.println("\nOutput 3:");
        ReceiptPrinter.printReceipt(ReceiptGenerator.generateReceipt(basket3));
    }
}
