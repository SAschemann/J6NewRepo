/*
 * this product is an unlicensed as I am to drive
 * 
 * but hey, enjoy it anyway!
 */
package utilities;

import Collections.Tracks; //weirdness
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Scott
 */
public class AudioPlayerTest {
    
    public AudioPlayerTest(){}
    private AudioPlayer AudioPlayer;
    
    
    @Before
    public void initiate(){
        
        try {
            AudioPlayer = new AudioPlayer();
        } 
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Enountered: "+ex);
        }
    }
    

    /**
     * Test of setTrack and getTrackPath methods, of class AudioPlayer.
     * import would not acknowledge Tracks so I did it manually 
     */
    @Test
    public void testTracks() {
        
        int trackNum = 0;
        int trackNum1 = -42;
        int trackNum2 = 9815674;
        
        AudioPlayer.setTrack(trackNum);
        String trackPath = Collections.Tracks.values()[trackNum].getFilePath();
        assertEquals("testing get track path", trackPath, AudioPlayer.getTrackPath());
        AudioPlayer.setTrack(trackNum1);
        trackPath = Collections.Tracks.values()[0].getFilePath();
        assertEquals("testing get track to low", trackPath, AudioPlayer.getTrackPath());
        AudioPlayer.setTrack(trackNum2);      
        trackPath = Collections.Tracks.values()[0].getFilePath();
        assertEquals("testing get track to high", trackPath, AudioPlayer.getTrackPath());
    }
}