/*
 * this product is an unlicensed as I am to drive
 * 
 * but hey, enjoy it anyway!
 */
package utilities;

import javax.sound.sampled.Clip;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scott
 */
public class AudioPlayerTest {
    
    public AudioPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setTrack method, of class AudioPlayer.
     */
    @Test
    public void testSetTrack_int() {
        System.out.println("setTrack");
        int trackNum = 0;
        AudioPlayer instance = new AudioPlayer();
        instance.setTrack(trackNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrack method, of class AudioPlayer.
     */
    @Test
    public void testSetTrack_String() {
        System.out.println("setTrack");
        String track = "";
        AudioPlayer instance = new AudioPlayer();
        instance.setTrack(track);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrackPath method, of class AudioPlayer.
     */
    @Test
    public void testGetTrackPath() {
        System.out.println("getTrackPath");
        AudioPlayer instance = new AudioPlayer();
        String expResult = "";
        String result = instance.getTrackPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClip method, of class AudioPlayer.
     */
    @Test
    public void testGetClip() {
        System.out.println("getClip");
        AudioPlayer instance = new AudioPlayer();
        Clip expResult = null;
        Clip result = instance.getClip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayStatus method, of class AudioPlayer.
     */
    @Test
    public void testGetPlayStatus() {
        System.out.println("getPlayStatus");
        AudioPlayer instance = new AudioPlayer();
        boolean expResult = false;
        boolean result = instance.getPlayStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class AudioPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        AudioPlayer instance = new AudioPlayer();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class AudioPlayer.
     */
    @Test
    public void testPause() {
        System.out.println("pause");
        AudioPlayer instance = new AudioPlayer();
        instance.pause();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playOnce method, of class AudioPlayer.
     */
    @Test
    public void testPlayOnce_0args() {
        System.out.println("playOnce");
        AudioPlayer instance = new AudioPlayer();
        instance.playOnce();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playOnce method, of class AudioPlayer.
     */
    @Test
    public void testPlayOnce_int() {
        System.out.println("playOnce");
        int trackNum = 0;
        AudioPlayer instance = new AudioPlayer();
        instance.playOnce(trackNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resumeAudio method, of class AudioPlayer.
     */
    @Test
    public void testResumeAudio() {
        System.out.println("resumeAudio");
        AudioPlayer instance = new AudioPlayer();
        instance.resumeAudio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetAudioStream method, of class AudioPlayer.
     */
    @Test
    public void testResetAudioStream() throws Exception {
        System.out.println("resetAudioStream");
        AudioPlayer instance = new AudioPlayer();
        instance.resetAudioStream();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class AudioPlayer.
     */
    @Test
    public void testStop() throws Exception {
        System.out.println("stop");
        AudioPlayer instance = new AudioPlayer();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shutDown method, of class AudioPlayer.
     */
    @Test
    public void testShutDown() throws Exception {
        System.out.println("shutDown");
        AudioPlayer instance = new AudioPlayer();
        instance.shutDown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volume method, of class AudioPlayer.
     */
    @Test
    public void testVolume() {
        System.out.println("volume");
        float decibles = 0.0F;
        AudioPlayer instance = new AudioPlayer();
        instance.volume(decibles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playEffect method, of class AudioPlayer.
     */
    @Test
    public void testPlayEffect() {
        System.out.println("playEffect");
        int[] trackNums = null;
        AudioPlayer instance = new AudioPlayer();
        instance.playEffect(trackNums);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
