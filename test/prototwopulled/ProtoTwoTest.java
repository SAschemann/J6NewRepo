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
public class ProtoTwoTest {
    
    public ProtoTwoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * ENSURE CONSTRUCTOR MAKES AN OBJECT OF THE PROPER TYPE
     */
    @Test
    public void testConstructor() {
        ProtoTwo testOn = new ProtoTwo();
        assertTrue(testOn instanceof ProtoTwo);
    }
    
}
