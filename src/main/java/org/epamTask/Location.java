package org.epamTask;

public class Location {
    private final int floor;
    private final String wing;

    public Location(int floor, String wing) {
        this.floor = floor;
        this.wing = wing;
    }

    public int getFloor() {
        return floor;
    }

    public String getWing() {
        return wing;
    }
}
