/* TCSS Programming Practicum - Assignment 2
 * Nicole Guobadia
 */
package tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import model.Item;
import org.junit.Before;
import org.junit.Test;

/**
 * Tester for the equals method and the String method.
 * @author Nicole
 * @version 1.0.0
 *
 */
public class BookstoreEqualsAndToStringTester {
    /** The number 5, but BigDecimal version! */
    private static final BigDecimal FIVE = BigDecimal.valueOf(5);
    
    /**It's just a ', $' since checkstyle yelled at me for using the same phrase.*/
    private static final String DOLLAR_COMMA = ", $";
    
    /**The number 5, but integer version!*/
    private static final int FIVE_INTEGER = 5;
    
    /** The default name for all the valid constructors.*/
    private final String myName = "name";

    /** A generic Item using two parameters all non null.*/
    private Item myItemNonNull;

    /** A generic Item using four parameters all non null.*/
    private Item myItemBulkNonNull;

    /**
     * Instantiates itemNonNull and itemBulkNonNull.
     */
    @Before
    public void setUp() {
        myItemNonNull = new Item(myName, FIVE);
        myItemBulkNonNull = new Item(myName, FIVE, FIVE_INTEGER, FIVE);

    }
    
    /**
     * Tests the equals method with a null object.
     */
    @Test 
    public void testEqualsNull() {
        myItemNonNull.equals(null);
        
    }

    /**
     * Tests to make sure it detects if an item is not equal.
     */
    @Test
    public void testEqualsNonNullAssertFalse() {
        final boolean isItemEqual = myItemNonNull.equals(new Item("namme", FIVE));

        assertFalse("Two Param error, This should be false!", isItemEqual);
    }

    /**
     * Tests to make sure it detects if an item is equal.
     */
    @Test
    public void testEqualsNonNullAssertTrue() {
        final boolean isItemEqual = myItemNonNull.equals(new Item(myName, FIVE));
        assertTrue("Two Param error, This should be true!", isItemEqual);

    }

    /**
     * Tests to make sure it detects if a bulk item is not equal.
     */
    @Test
    public void testEqualsBulkNonNullAssertFalse() {
        final boolean isItemEqual = myItemBulkNonNull.equals(new Item(myName, FIVE, 4, FIVE));
        assertFalse("Four param error, This should be false!", isItemEqual);

    }

    /**
     * Tests to make sure it detects if a bulk item is equal.
     */
    @Test
    public void testEqualsBulkNonNullAssertTrue() {
        final boolean isItemEqual = myItemBulkNonNull.equals(new Item(myName, FIVE, 5, FIVE));
        assertTrue("Four param error, This should be true!", isItemEqual);

    }
    
    /**
     * Tests to make sure the toString is working with two parameters.
     */
    @Test
    public void testToStringTwoParameters() {
        final String itemToString = myItemNonNull.toString();
        final StringBuilder build = new StringBuilder();

        build.append(myName + DOLLAR_COMMA + myItemNonNull.getPrice());

        assertEquals("Error in toString() for two parameters: ",
                   build.toString(), itemToString);
        
    }
    
    /**
     * Tests to make sure the toString() is working with four parameters.
     */
    @Test
    public void testToStringFourParameters() {
        final String itemToString = myItemBulkNonNull.toString();
        final StringBuilder build = new StringBuilder();
        
        build.append(myName + DOLLAR_COMMA + myItemBulkNonNull.getPrice() 
                         + " (" + myItemBulkNonNull.getBulkQuantity()
                         + " for $" + myItemBulkNonNull.getBulkPrice() + ")");
        
        assertEquals("Error in toString() for four parameters: ",
                     build.toString(), itemToString);
        
    }

}
