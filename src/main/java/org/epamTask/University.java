package org.epamTask;

import java.util.Date;
import java.util.Map;

public class University extends Building {
    private String name;
    private String principal;
    private UniversityType UniversityType;
    private Map<Location, CoffeeMachine> coffeeMachineMap;

    public University(String name, BuildingType type, String owner, String cadastralCode, Date builtYear,
                      String universityName, String principal, UniversityType universityType) {
        super(name, type, owner, cadastralCode, builtYear);
        this.name = universityName;
        this.UniversityType = universityType;
        this.principal = principal;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public UniversityType UniversityType() {
        return UniversityType;
    }

    public void setUniversityType(UniversityType type) {
        this.UniversityType = type;
    }

    public Map<Location, CoffeeMachine> getCoffeeMachineMap() {
        return coffeeMachineMap;
    }

    public void addCoffeeMachineToMap(Location location, CoffeeMachine coffeeMachine) {
        this.coffeeMachineMap.put(location, coffeeMachine);
    }

    public void removeCoffeeMachineFromLocation(Location location, CoffeeMachine coffeeMachine) {
        this.coffeeMachineMap.remove(location, coffeeMachine);
    }
}
