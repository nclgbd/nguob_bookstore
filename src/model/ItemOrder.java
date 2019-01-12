/*
 * TCSS 305 B Programming Practicum - Assignment 2 
 * Nicole Guobadia
 */

package model;

import java.util.Objects;

/**
 * The class for an ItemOrder, which is typically added to a Cart.
 * 
 * @author Nicole
 * @version 1.0.0
 *
 */
public final class ItemOrder {

    /** The Item paired with the quantity. */
    private Item myItem;

    /** The quantity paired with the item. */
    private int myQuantity;

    /**
     * Constructor that creates an item order for the given quantity of the
     * given Item. The quantity is an int.
     * 
     * @param theItem the item to be added to the item order.
     * @param theQuantity the amount of the item you want to add to the order.
     */
    public ItemOrder(final Item theItem, final int theQuantity) {
        myItem = Objects.requireNonNull(theItem);

        if (theQuantity < 0) {
            throw new IllegalArgumentException();

        } else {
            myQuantity = theQuantity;

        }
    }

    /**
     * Returns a reference to the Item in this ItemOrder.
     * 
     * @return the item.
     */
    public Item getItem() {
        return myItem;
    }

    /**
     * Returns the quantity for this ItemOrder.
     * 
     * @return the quantity.
     */
    public int getQuantity() {
        return myQuantity;
    }

    @Override
    public boolean equals(final Object theObject) {
        try {
            Objects.requireNonNull(theObject);

        } catch (final NullPointerException e) {
            System.out.println("Error: " + e);
            return false;

        }

        if (theObject.getClass() != this.getClass()) {
            return false;

        }

        final ItemOrder newItemOrder = (ItemOrder) theObject;

        
        final Item newItem = newItemOrder.getItem();

        if (!newItem.equals(this.getItem())) { // symmetry
            return false;

        }
        return false;

    }

    @Override
    public int hashCode() {
        /*Objects.hash(my)
        return Objects.hash(myItem);//System.identityHashCode(this);*/
        return 0;
        

    }

    /**
     * Returns a String representation of this ItemOrder: You may use any format
     * that seems reasonable to you for this String.
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();

        builder.append("( ");

        if (myItem != null) {

            builder.append(myItem);

        }

        if (myQuantity != 0) {

            builder.append(", ");

            builder.append(myQuantity);

        }

        builder.append(" )");

        return builder.toString();
    }

}
