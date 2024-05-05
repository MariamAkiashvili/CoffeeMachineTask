package org.epamTask;

import java.util.List;

public class Coffee extends Drink {

    private RoastLevel roastLevel;
    private CoffeeType type;
    private String origin;
    private Double caffeineContent;

    private List<String> additives;

    public Coffee(String name, double price, double volume, String manufacturer, RoastLevel roastLevel,
                  CoffeeType coffeeType, String origin, double caffeineContent) {
        super(name, price, volume, manufacturer);
        this.roastLevel = roastLevel;
        this.type = coffeeType;
        this.origin = origin;
        this.caffeineContent = caffeineContent;
    }


    public RoastLevel getRoastLevel() {
        return roastLevel;
    }

    public void setRoastLevel(RoastLevel roastLevel) {
        this.roastLevel = roastLevel;
    }

    public CoffeeType getType() {
        return type;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getCaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(double caffeineContent) {
        this.caffeineContent = caffeineContent;
    }

    public List<String> getAdditives() {
        return additives;
    }

    public void addAdditive(String additive) {
        additives.add(additive);
    }

    public void removeAdditive(String additive) {
        additives.remove(additive);
    }


}
