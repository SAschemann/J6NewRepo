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
     * Test of damageUpdateHP method, of class UserPlayer.
     */
    @Test
    public void testDamageUpdateHP() {
        System.out.println("damageUpdateHP");
        int health = 100;
        int damage = 10;
        int expectedResult = 90;
        UserPlayer instance = new UserPlayer();
        instance.setHP(health);
        instance.damageUpdateHP(damage);
        assertEquals(expectedResult,instance.getCurHP());
    }

    /**
     * Test of healsUpdateHP method, of class UserPlayer.
     */
    @Test
    public void testHealsUpdateHP() {
        System.out.println("healsUpdateHP");
        int heals = 10;
        int damage = 15;
        int expectedResult = 95;
        UserPlayer instance = new UserPlayer();
        instance.damageUpdateHP(damage);
        instance.healsUpdateHP(heals);
        assertEquals(expectedResult,instance.getCurHP());
    }

    /**
     * Test of updateInventory method, of class UserPlayer.
     */
    @Test
    public void testUpdateInventory() {
        System.out.println("updateInventory");
        String item = "iron bar";
        int expectedResult = 1;
        UserPlayer instance = new UserPlayer();
        instance.updateInventory(item);
        assertEquals(instance.invSize(),expectedResult);
    }

    /**
     * Test of updateWeapon method, of class UserPlayer.
     */
    @Test
    public void testUpdateWeapon() {
        System.out.println("updateWeapon");
        String weapon = "sword";
        String expectedResult = "sword";
        UserPlayer instance = new UserPlayer();
        instance.updateWeapon(weapon);
        assertEquals(instance.getCurWeapon(),expectedResult);
    }


    /**
     * Test of equipPipBoy method, of class UserPlayer.
     */
    @Test
    public void testEquipPipBoy() {
        System.out.println("equipPipBoy");
        UserPlayer instance = new UserPlayer();
        instance.equipPipBoy();
        assertTrue(instance.inquirePipBoy());
    }

    /**
     * Test of updatePosition method, of class UserPlayer.
     */
    @Test
    public void testUpdatePosition() {
        System.out.println("updatePosition");
        String place = "kitchen";
        String expectedResult = "kitchen";
        UserPlayer instance = new UserPlayer();
        instance.updatePosition(place);
        assertEquals(instance.getPlayerPosition(),expectedResult);
    }
    
    @Test
    public void testSecretOne(){
        UserPlayer instance = new UserPlayer();
        assertFalse(instance.inquireSecretOne());
        instance.equipSecretOne();
        assertTrue(instance.inquireSecretOne());
    }
    
    @Test
    public void testSecretTwo(){
        UserPlayer instance = new UserPlayer();
        assertFalse(instance.inquireSecretTwo());
        instance.equipSecretTwo();
        assertTrue(instance.inquireSecretTwo());
    }
    
    @Test
    public void testSecretThree(){
        UserPlayer instance = new UserPlayer();
        assertFalse(instance.inquireSecretThree());
        instance.equipSecretThree();
        assertTrue(instance.inquireSecretThree());
    }

    
}
