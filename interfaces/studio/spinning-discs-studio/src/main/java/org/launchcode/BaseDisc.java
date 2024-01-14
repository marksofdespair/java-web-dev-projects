package org.launchcode;

public abstract class BaseDisc {
    protected String name;
    protected double capacity;
    protected String contents;
    protected String discType;

    public BaseDisc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    // getters, public
    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    // setters, public
    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    // shared useable methods
    public void loadDisc() {
        System.out.println(name + " was loaded into the disc player.");
    }

    public void unloadDisc() {
        System.out.println(name + " was ejected from the disc player.");
    }

    // abstract method, implemented via subclasses
    public abstract void printDiscInfo();
}