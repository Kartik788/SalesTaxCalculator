package com.makkajai.salestax;

public enum Category {
    BOOK(false),
    FOOD(false),
    MEDICAL(false),
    OTHER(true);

    private final boolean taxable;

    Category(boolean taxable) {
        this.taxable = taxable;
    }

    public boolean isTaxable() {
        return taxable;
    }
}
