/*Author: Joshua Sinclair
Title: StockListTester.java 
WorldCreated: 23/04/2023
Version: 1.0*/

import java.util.*;
import java.io.*;

public class StockListTester 
{
    public static void main(String[]args)
    {
        /*
            take StockLinked list and input data to it
            I am not using StockList, that is different to the list 
            I have just created. Note this list is lower case s  
        */

        /*
            This way by creating a linked list object you dont
            have to create multiple objects to manipulate data
         */
        
        StockLinkedList stockList = new StockLinkedList();

        //add items to stockList
        //passes data to StockItem class
        stockList.addItem(new StockItem("Ht34", "x1 hammer", 20.0, 10, 7));
        stockList.addItem(new StockItem("Md56", "x1 mallet", 15.99, 18, 5));
        stockList.addItem(new StockItem("wR12", "x1 metal wrench", 10.50, 2, 3));
        stockList.addItem(new StockItem("tb90", "x1 tool box", 50.49, 1, 2));
        stockList.addItem(new StockItem("nS", "x100 nails", 2.99, 50, 20));

        //now print the list in test form

        System.out.println("----- Original list ----- \n");
        System.out.println(stockList.formatStockList());  //testing the format methods and constructor

        //testing update functions
        stockList.updateItemPrice("Ht34", 15.99);
        stockList.updateItemQuantity("wR12", 30);
        stockList.updateReOrderLevel("nS", 10);

        //now print the updated list

        System.out.println("----- Updated list -----\n");
        System.out.println("----- After update methods  -----\n");
        System.out.println(stockList.formatStockList());

       
        System.out.println(stockList.formatReOrderList()); //testing the re order list format


        try
        {
            stockList.deleteItem("nS");

            System.out.println("----- Updated list -----\n");
            System.out.println(stockList.formatStockList());
        }
        catch(ItemNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

       //delete another item but make it fail 

        try
        {
            stockList.deleteItem("4S");

            System.out.println("----- Updated list -----\n");
            System.out.println(stockList.formatStockList());
        }
        catch(ItemNotFoundException e) //local variable e
        {
            System.out.println("\n------ Trying to delete another item ------\n");
            System.out.println(e.getMessage());
        }

        // ----------------------- try adding same id -----------------------------
        
        System.out.println("------ adding an existing item -------\n");

        stockList.addItem(new StockItem("Md56", "x1 mallet", 15.99, 18, 5));

        

        
        
     // ---------------------------------------------- new code ------------------------------------------------------------------

        System.out.println("\n ------ v saving this data v ------ \n");
        System.out.println("\n"+stockList.formatStockList()); //pre-saving data

        stockList.saveStockData("save.dat");

        // stockList.delete("wR12");
        StockLinkedList stockList2 = new StockLinkedList();
        System.out.println("\n ------ empty list ------ \n");
        System.out.println(stockList2.formatStockList());


        System.out.println("-------- Re loaded data --------- \n");
        stockList2.loadStockData("save.dat");
        System.out.println(stockList2.formatStockList());
        
    }
}

