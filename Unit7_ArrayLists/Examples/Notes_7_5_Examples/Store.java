package Unit7_ArrayLists.Examples.Notes_7_5_Examples;

// import ArrayList class

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {
    ArrayList<Item> myItems = new ArrayList<Item>();
    // declare an instance variable of an ArrayList of type Item called myItems

    public Store(ArrayList<Item> itemList) {
        // instantiate the ArrayList myItems
        myItems = itemList;
    }

    public Store()
    {

    }

    /**
     * This method will first search the ArrayList to see if there
     * is an Item in the ArrayList equal to newItem.
     *
     * If the item is found, then the quantity in stock is updated
     * to add the amount of the newItem to the existing amount in stock.
     *
     * If the item is not found in myItems, then add the Item to
     * the end of the ArrayList
     *
     * @param newItem - the item to add or update stock with
     * @return	true 	if an item was added to the ArrayList
     * 			false 	if no new items were added
     */

    public boolean updateStock(Item newItem) {
        boolean isFound = false;
        for(int i = 0; i < myItems.size(); i++)
        {
            if(myItems.get(i).equals(newItem)) //if item was found, update quantity
            {
                myItems.get(i).setQuantity(myItems.get(i).getQuantity() +  newItem.getQuantity());
                isFound = true;
            }
        }

        if(isFound == false)
        {
            myItems.add(newItem);
        }
        return !isFound;
    }

    /**
     * This method returns a String representation of every Item in the ArrayList
     * The toString of the Item class should be called here as a helper method.
     */

    public String toString() {
        String output = "Name, Price, Quantity\n";

        for(int i = 0; i < myItems.size(); i++)
        {
            output += myItems.get(i).toString() + "\n";
        }

        return output;

    }

}
