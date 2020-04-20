/*
 * this product is an unlicensed as I am to drive
 * 
 * but hey, enjoy it anyway!
 */
package Collections;

/**
 *
 * @author Scott
 */
public enum Tracks {
       
    TRACK_ZERO(0, "Start Theme", "/music/Ev23.wav"),
    TRACK_ONE(1,"Redo Start Theme","music/workYet.wav");
    
    private final int number;
    private final String description;
    private final String filePath;

    
    private Tracks(int number, String description, String filePath){
        
        this.number = number;
        this.description = description;
        this.filePath = filePath;

        
    }
    
    public int getNumber(){ //finds track number
        return this.number;
    }
    
    public String getDescription() { //finds track description
        return this.description;
    }

    public String getFilePath() { //finds filepath for song or sound effect
        return this.filePath;
    }

}
