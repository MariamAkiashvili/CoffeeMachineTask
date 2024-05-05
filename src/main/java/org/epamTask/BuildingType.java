package org.epamTask;

public enum BuildingType {
    UNIVERSITY("university"),
    CINEMA("Cinema"),
    SCHOOL("School"),
    THEATRE("Theatre"),
    GROCERY("Grocery"),
    STORE("Store");

    private final String name;

    BuildingType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
