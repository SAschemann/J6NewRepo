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
public class UserPlayerTest {
    
    public UserPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setHP method, of class UserPlayer.
     */
    @Test
    public void testSetHP() {
        System.out.println("setHP");
        int health = 0;
        UserPlayer instance = new UserPlayer();
        instance.setHP(health);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of damageUpdateHP method, of class UserPlayer.
     */
    @Test
    public void testDamageUpdateHP() {
        System.out.println("damageUpdateHP");
        int damage = 0;
        UserPlayer instance = new UserPlayer();
        instance.damageUpdateHP(damage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of healsUpdateHP method, of class UserPlayer.
     */
    @Test
    public void testHealsUpdateHP() {
        System.out.println("healsUpdateHP");
        int heals = 0;
        UserPlayer instance = new UserPlayer();
        instance.healsUpdateHP(heals);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateInventory method, of class UserPlayer.
     */
    @Test
    public void testUpdateInventory() {
        System.out.println("updateInventory");
        String item = "";
        UserPlayer instance = new UserPlayer();
        instance.updateInventory(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWeapon method, of class UserPlayer.
     */
    @Test
    public void testUpdateWeapon() {
        System.out.println("updateWeapon");
        String weapon = "";
        UserPlayer instance = new UserPlayer();
        instance.updateWeapon(weapon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurWeapon method, of class UserPlayer.
     */
    @Test
    public void testGetCurWeapon() {
        System.out.println("getCurWeapon");
        UserPlayer instance = new UserPlayer();
        String expResult = "";
        String result = instance.getCurWeapon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurHP method, of class UserPlayer.
     */
    @Test
    public void testGetCurHP() {
        System.out.println("getCurHP");
        UserPlayer instance = new UserPlayer();
        int expResult = 0;
        int result = instance.getCurHP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equipPipBoy method, of class UserPlayer.
     */
    @Test
    public void testEquipPipBoy() {
        System.out.println("equipPipBoy");
        UserPlayer instance = new UserPlayer();
        instance.equipPipBoy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePosition method, of class UserPlayer.
     */
    @Test
    public void testUpdatePosition() {
        System.out.println("updatePosition");
        String place = "";
        UserPlayer instance = new UserPlayer();
        instance.updatePosition(place);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerPosition method, of class UserPlayer.
     */
    @Test
    public void testGetPlayerPosition() {
        System.out.println("getPlayerPosition");
        UserPlayer instance = new UserPlayer();
        String expResult = "";
        String result = instance.getPlayerPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inquirePipBoy method, of class UserPlayer.
     */
    @Test
    public void testInquirePipBoy() {
        System.out.println("inquirePipBoy");
        UserPlayer instance = new UserPlayer();
        boolean expResult = false;
        boolean result = instance.inquirePipBoy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPip method, of class UserPlayer.
     */
    @Test
    public void testSetPip() {
        System.out.println("setPip");
        boolean boy = false;
        UserPlayer instance = new UserPlayer();
        instance.setPip(boy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
