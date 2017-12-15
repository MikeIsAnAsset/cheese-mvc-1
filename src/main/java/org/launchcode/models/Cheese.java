package org.launchcode.models;

public class Cheese {

    private String name;
    private String description;
    private int cheeseID;
    private static int nextID = 1;

    public Cheese(String aName, String aDescription) {
        this();
        name = aName;
        description = aDescription;
    }

    public Cheese() {
        cheeseID = nextID;
        nextID++;
    }

    public int getCheeseID() {
        return cheeseID;
    }

    public void setCheeseID(int cheeseID) {
        this.cheeseID = cheeseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
