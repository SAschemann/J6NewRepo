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
    TRACK_ONE(1,"Background Music","/music/gameBGM.wav"),
    TRACK_TWO(2,"Death Grunt","/soundEffects/deathGrunt.wav"),
    TRAC_THREE(3,"Electricution","/soundEffects/electricution.mp3"),
    TRACK_FOUR(4,"Footsteps on pavement","/soundEffects/footStepsPavement.wav"),
    TRACK_FIVE(5,"Footsteps on metal","/soundEffects/footstepsMetal.wav"),
    TRACK_SIX(6,"Lighter Footsteps","/soundEffects/lighterFootsteps.mp3"),
    TRACK_SEVEN(7,"Victory!!!","/soundEffects/victorySound.wav");
    
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
