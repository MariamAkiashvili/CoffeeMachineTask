package org.epamTask;

public class Drink {
    private String name;
    private double price;
    private double volume;
    private String manufacturer;


    public Drink(String name, double price, double volume, String manufacturer) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.manufacturer = manufacturer;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


}
