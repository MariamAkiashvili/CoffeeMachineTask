package org.epamTask;

public enum CoffeeType {
    ESPRESSO("Espresso"),
    LATTE("Latte"),
    CAPPUCCINO("Cappuccino"),
    AMERICANO("Americano"),
    MOCHA("Mocha"),
    MACCHIATO("Macchiato");

    private final String name;

    CoffeeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
