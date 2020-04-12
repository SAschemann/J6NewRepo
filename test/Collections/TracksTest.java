/*
 * this product is an unlicensed as I am to drive
 * 
 * but hey, enjoy it anyway!
 */
package Collections;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scott
 */
public class TracksTest {
    
    public TracksTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of values method, of class Tracks.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Tracks[] expResult = null;
        Tracks[] result = Tracks.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Tracks.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Tracks expResult = null;
        Tracks result = Tracks.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class Tracks.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Tracks instance = null;
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Tracks.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Tracks instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilePath method, of class Tracks.
     */
    @Test
    public void testGetFilePath() {
        System.out.println("getFilePath");
        Tracks instance = null;
        String expResult = "";
        String result = instance.getFilePath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
