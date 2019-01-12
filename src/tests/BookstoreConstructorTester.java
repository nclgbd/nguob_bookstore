/* TCSS 305 Programming Practicum - Assignment 2
 * Nicole Guobadia
 */
package tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import model.Item;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the constructors of the Item class.
 * @author Nicole
 * @version 1.0.0
 */
public class BookstoreConstructorTester {
    /**Literally the number five.*/
    private static final int FIVE = 5;
    
    /** The default name for all valid instantiations.*/
    private final String myName = "name";
    
    /** Item with the two parameter constructor, both non null. */
    private Item myItemNonNull;
    
    /** Item with the four parameter constructor. All non null. */
    private Item myItemBulkNonNull;
    
    


    /**
     * Instantiates all of the possible item constructors.
     */
    @Before
    public void setUp() {
        myItemNonNull = new Item(myName, new BigDecimal(FIVE));
        myItemBulkNonNull = new Item(myName, new BigDecimal(FIVE), FIVE, new BigDecimal(FIVE));

    }
    
    // Constructor testers

    /**
     * Tests the two parameter constructor with no nulls.
     */
    @Test
    public void testConstructorWithTwoParametersNonNull() {
        assertEquals("Error with two parameter constructor: no nulls, ",
                     new Item(myName, new BigDecimal(FIVE)), myItemNonNull);

    }
    
    /**
     * Tests the four parameter constructor with no nulls.
     */
    @Test
    public void testConstructorWithFourParametersNonNull() {
        assertEquals("Error with four parameter constructor: no nulls, ",
                     new Item(myName, new BigDecimal(FIVE), FIVE, new BigDecimal(FIVE)),
                     myItemBulkNonNull);
        
    }
    
    /**
     * Tests the two parameter constructor with price null.
     */
    @Test (expected = NullPointerException.class)
    public void testConstructorWithTwoParametersPriceNull() {
        new Item(myName, null);
        
    }
    
    /**
     * Tests the four parameter constructor with price null.
     */
    @Test (expected = NullPointerException.class)
    public void testConstructorWithFourParametersPriceNull() {
        new Item(myName, null, FIVE, new BigDecimal(FIVE));
        
    }
    
    /**
     * Tests the four parameter constructor with the bulk quantity being zero.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testConstructorWithFourParametersQuantityZero() {
        new Item(myName, new BigDecimal(FIVE), 0, new BigDecimal(FIVE));
        
    }
    
    /**
     * Tests the four parameter constructor with the bulk price being null.
     */
    @Test (expected = NullPointerException.class)
    public void testConstructorWithFourParameterBulkPriceZero() {
        new Item(myName, new BigDecimal(FIVE), FIVE, null);
        
    }

}
