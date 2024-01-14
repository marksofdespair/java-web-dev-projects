package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // bp 1
        // constructor calls w required params
        CD myCd = new CD("My CD", 0.7, "Music Album", "Artist Name", 1999);
        DVD myDvd = new DVD("My DVD", 4.7, "Movie", "Director Name", 2008);

        // bp 2
        // behaviors
        myCd.spinDisc();
        myDvd.spinDisc();

        // bp 3
        // some additional behaviors
        myCd.writeDataUsingLaser();
        myDvd.startPlaying();

        // throws error
        try {
            throw new Error("Holy sht you broke it again.");
        } catch(Error e){
            e.printStackTrace();
        }
    }
}