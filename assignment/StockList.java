/*Author: Joshua Sinclair
Title: StockList.java 
WorldCreated: 23/04/2023
Version: 1.0*/

import java.util.*;
import java.io.*;

public interface StockList
{
    /**
     * @param item
     * passes item through
     */

    public void addItem(StockItem item);

    /**
     * @param filePath
     * loads the stock file data .dat
     */
    void loadStockData(String filePath);
    
     /**
      * @throws ItemNotFoundException
      * throws the not found
      * @param itemID
      * passes ID through
      */
    void deleteItem(String itemID) throws ItemNotFoundException;
    
    /**
     * @param price
     * passes through price and uses param itemID to check
     * @param itemID
     * passes through the id
     */

    public void updateItemPrice(String itemID, double price);

    /**
     * @param quantity
     * passes through quanity and uses itemID to check
     * @param itemID
     * passes through the id
     */

    public void updateItemQuantity(String itemID, int quantity);

    /**
     * @param reOrderLevel
     * passes through re order level and uses itemID to check
     * @param itemID
     * passes through the id
     */

    public void updateReOrderLevel(String itemID, int reOrderLevel);

    // ---------------------------------------------- new code ------------------------------------------------------------------

    // /**
    //  * @param filename
    //  * @throws IOException
    //  * @throws ClassNotFoundException
    //  * passes these params and throws for save and load
    //  */

    // //these will both be implemented in stockLinkedList

    // public void loadStockData(String filename) throws IOException, ClassNotFoundException; //Input output exception, and loading the file data

    // public void saveStockData(String filename) throws IOException; //saves data from sl to file opened. Doesnt need the notfound because will be already open

    public String formatStockList();

    //items are on this list if quantity is < reOrderLevel
    public String formatReOrderList();
    

}