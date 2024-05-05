package org.epamTask;

public class Location {
    private Integer floor;
    private String wing;

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

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }
}
