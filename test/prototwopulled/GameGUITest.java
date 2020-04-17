/*
 * this product is an unlicensed as I am to drive
 * 
 * but hey, enjoy it anyway!
 */
package prototwopulled;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scott
 */
public class GameGUITest {
    
    public GameGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    
    /**
     * Test of constructor, GameGUI class. Ensures it is making a proper object. 
     */
    @Test
    public void testConstructor(){
        UserPlayer play = new UserPlayer();
        GameGUI testOn = new GameGUI(play);
        assertTrue(testOn instanceof GameGUI);
    }
    
    
    //-- THIS TEST IS DEPENDENT UPON THERE BEING A SAVE FILE, BECAUSE IT TESTS THE LOAD CONSTRUCTOR. IF YOU HAVE NOT CREATED A SAVE FILE
    //THIS TEST WILL FAIL --
    @Test
    public void testLoadConstructor(){
        String dString = "dummy string";
        UserPlayer play = new UserPlayer();
        GameGUI testOn = new GameGUI(play, dString);
        assertTrue(testOn instanceof GameGUI);
    }
}
