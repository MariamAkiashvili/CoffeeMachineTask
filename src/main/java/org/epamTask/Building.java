package org.epamTask;

import java.util.Date;

public class Building {
    private String name;
    private BuildingType type;
    private String owner;
    private String cadastralCode;
    private Date builtDate;

    public Building(String name, BuildingType type, String owner, String cadastralCode, Date builtDate) {
        this.name = name;
        this.type = type;
        this.owner = owner;
        this.cadastralCode = cadastralCode;
        this.builtDate = builtDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BuildingType getType() {
        return type;
    }

    public void setType(BuildingType type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCadastralCode() {
        return cadastralCode;
    }

    public void setCadastralCode(String cadastralCode) {
        this.cadastralCode = cadastralCode;
    }

    public Date getBuiltDate() {
        return builtDate;
    }

    public void setBuiltYear(Date date) {
        this.builtDate = date;
    }


}
