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
public class ProtoGUITest {
    
    public ProtoGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testConstructor(){
        ProtoGUI testOn = new ProtoGUI();
        assertTrue(testOn instanceof ProtoGUI);
    }
    
}
