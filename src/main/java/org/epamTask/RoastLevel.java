package org.epamTask;

public enum RoastLevel {
    LIGHT("Light"),
    MEDIUM("Medium"),
    DARK("Dark");

    private final String name;

    RoastLevel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
