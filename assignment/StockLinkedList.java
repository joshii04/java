/*Author: Joshua Sinclair
Title: StockLinkedList.java 
WorldCreated: 23/04/2023
Version: 1.0*/

import java.util.*;
import java.io.*;


public class StockLinkedList  implements StockList
{
    
    /**
     * @param items
     * linked list name
     */
    // implement
    private LinkedList<StockItem> items;  //inherits StockItem enters through LL to items

    File f = new File("save.dat");


    //instantiate LL
    public StockLinkedList()
    {
        items = new LinkedList<>(); //create 
        // loadStockData(filename);
    }

    /**
     * @param item
     * pass through item
     */

    public void addItem(StockItem item) //add function
    {
        for(int i = 0; i < items.size(); i++)
        {
            if(item.getItemID().equals( items.get(i).getItemID()))
            {
                System.out.println("[ Sorry that items already exists ] ");
                return;
            }
        }

        items.add(item); //adds item to LL items
    
    }

    /**
     * @param message
     * passes through exception methods
     */
        

    /**
     * @param itemID
     * passes through itemID to delete the item in the list if matched
     */

     public void deleteItem(String itemID) throws ItemNotFoundException {
        boolean itemFound = false;
    
        for (int i = 0; i < items.size(); i++) {
            StockItem temp = items.get(i);
            if (temp.getItemID().equals(itemID)) {
                items.remove(i);
                System.out.println("You have deleted: " + temp);
                itemFound = true;
                break;
            }
        }
    
        if (!itemFound) {
            throw new ItemNotFoundException("[ The item you requested to delete doesn't exist ]\n");
        }
    }

    /**
     * @param price
     * passes through the item price and also passes through itemID for string compparison 
     */

    public void updateItemPrice(String itemID, double price)
    {
        for(StockItem item : items) //for every item in items with the below
        {
            if(item.getItemID().equals(itemID))
            {
                //set the new val
                item.setPrice(price); //pass through the param in here from the input
                break; //once done, leave
            }
        }
    }

    /**
     * @param quantity
     * passes throught Item quantity and uses itemId to check list
     */

    public void updateItemQuantity(String itemID, int quantity)
    {
        for(StockItem item : items)
        {
            if(item.getItemID().equals(itemID))
            {
                item.setQuantity(quantity);
                break;
            }
        }
    }

    /**
     * @param reOrderLevel
     * passes through re order level and uses item Id for list comparisson
     */

    public void updateReOrderLevel(String itemID, int reOrderLevel)
    {
        for(StockItem item : items)
        {
            if(item.getItemID().equals(itemID))
            {
                item.setReOrderLevel(reOrderLevel);
                break;
            }
        }
    }

    // Loads data from the stock file into the stock list
    public void loadStockData(String filename)
    {
        // try
        // {
        //     ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
        //     items = (LinkedList<StockItem>) in.readObject();
        //     in.close();
        // }
        // catch(IOException e){}
        // catch(ClassNotFoundException e){}

        try 
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            items = (LinkedList<StockItem>) in.readObject();
            in.close();
        } 

        catch (IOException e) 
        {
            System.err.println("Error loading stock data (IOException): " + e.getMessage());
        } 
        
        catch (ClassNotFoundException e)
        {
            System.err.println("Error loading stock data (ClassNotFoundException): " + e.getMessage());
        }

        catch (ClassCastException e)
        {
            e.printStackTrace(); //show error
        }
       
    }
    // Saves data from stock list to file

    public void saveStockData(String filename)
    { 
        try
        {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));

            out.writeObject(items);

            out.close();
        }
        
        catch(IOException e){}
    }

    

   /**
    * @return toString
    * returns the string method layout
    */

    public String formatStockList()
    {
        StringBuilder s = new StringBuilder();
        
        s.append(String.format("%-10s %-20s %-10s %-10s %-20s", "ItemID", "Description", "Price", "Qnty", "Re-Order Level" ))
        .append("\n******     ***********          *****      ****       **************\n");

        for(StockItem item : items)
        {
            s.append(item.format()).append("\n");
        }

        return s.toString();
    }

    /**
    * @return toString
    * returns the string method layout for re order list
    */
    
    public String formatReOrderList()//this is used to check if there are any items that are below the threshold of their reOrder levels
    {
        StringBuilder s = new StringBuilder();

        s.append("---- RE ORDER LIST ---- \n\n"); //append means to attach to StringBuilder
        s.append(String.format("%-10s %-20s %-10s %-10s %-20s", "ItemID", "Description", "Price", "Qnty", "Re-Order Level" ))
        .append("\n******     ***********          *****      ****       **************\n");

        for(StockItem item : items)
        {
            if(item.getQuantity() < item.getReOrderLevel())
            {
                s.append(item.format()).append("\n");
            }
        }

        return s.toString();
    }
}
