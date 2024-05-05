package org.epamTask;

import java.util.List;

public class CoffeeMachine {
    private final String name;
    private final String model;
    private List<Coffee> coffeeList;

    public CoffeeMachine(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(List<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }

    public void addCoffeeToList(Coffee newCoffee) {
        coffeeList.add(newCoffee);
    }

    public void removeCoffeeFromList(Coffee removed) {
        coffeeList.remove(removed);
    }

}
