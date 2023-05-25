package assignmentTwo;

import java.util.*;
import java.io.*;

public interface StockList2 
{
   // public void addItem(StockItem2 item);

   // void loadStockData2(String filepath); 

    // Adds item to stock list
    public void addItem(StockItem2 item);

    // Removes item identified by productID from stock list
    public void deleteItem(String itemID) throws ItemNotFoundException;

    // Updates price of existing item
    public void updateItemPrice(String itemID, double price);

// Updates quantity of existing item
    public void updateItemQuantity(String itemID, int quantity);

    // Updates re-order level of existing item
    public void updateReOrderLevel(String itemID, int reOrderLevel);

    // Returns formatted representation of the stock list
    public String formatStockList();

    // Returns formatted representation of re-order list
    // Items are on this list if quantity < reOrderLevel

    public String formatReOrderList();
   
}
