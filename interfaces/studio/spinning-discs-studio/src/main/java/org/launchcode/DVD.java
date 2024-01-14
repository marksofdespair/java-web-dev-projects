package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    // dvd specific fields
    private String director;
    private int  yearReleased;

    // constructor
    public DVD(String name, double capacity, String contents, String director, int  yearReleased) {
        super(name, capacity, contents, "DVD");
        this.director = director;
        this. yearReleased =  yearReleased;
    }

    // implementations for OpticalDisc interface methods
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeDataWithLaser() {
        System.out.println("Writing data to DVD now...");
    }

    @Override
    public void readDataWithLaser() {
        System.out.println("Reading data from DVD now...");
    }

    @Override
    public void reportInformation() {
        System.out.println("DVD Name: " + fetchName() + ", Capacity: " + fetchCapacity() +
                "GB, Contents: " + fetchContents() + ", Director: " + director +
                ", Release Year: " +  yearReleased);
    }

    @Override
    public void stopPlaying() {
        System.out.println("DVD has stopped playing.");
    }
    
    @Override
    public void startPlaying() {
        System.out.println("DVD is starting to play.");
    }

    @Override
    public void ejectDisc() {
        System.out.println("DVD is ejected from the player.");
    }

    // dvd getters & setters
    public String fetchDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
    public void set yearReleased(int  yearReleased) { this. yearReleased =  yearReleased; }
    public int get yearReleased() { return  yearReleased; }
    @Override
    public void printDiscInfo() { }
}