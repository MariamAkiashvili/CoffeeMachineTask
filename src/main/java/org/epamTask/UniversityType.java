package org.epamTask;

public enum UniversityType {
    PUBLIC("Public"),
    PRIVATE("Private");

    private final String name;

    UniversityType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
