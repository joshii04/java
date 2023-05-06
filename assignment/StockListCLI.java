/*Author: Joshua Sinclair
Title: StockListCLI.java 
WorldCreated: 23/04/2023
Version: 1.0*/

import java.util.*;
import java.io.*;

public class StockListCLI 
{
    private StockList stock = null;
    private Scanner scanIt;

    public StockListCLI(StockList stock) {
        this.stock = stock;
        scanIt = new Scanner(System.in);
    }

    // Displays main menu and gets valid option from user
    public void doMenu() {

        while(true)
        {
      
            int choice;

            System.out.println("\nStock List Main Menu");
            System.out.println("********************");
            System.out.println("1. Add an Item \n");
            System.out.println("2. Delete an Item \n");
            System.out.println("3. Update Item Price \n");
            System.out.println("4. Update Item Quantity \n");
            System.out.println("5. Update Re-Order Level \n");
            System.out.println("6. Print Stock List \n");
            System.out.println("7. Print ReOrder List \n");
            System.out.println("8. Exit \n");
    
            System.out.print("Select option [1-8] :> ");
            choice = scanIt.nextInt();
            scanIt.nextLine();

            if (choice < 1 || choice > 9)
            {
                System.out.println("[ Incorrect input, try again ] ");
                continue; //powerful
            }
    
            switch (choice) {
                case 1:
                    doAddItem();
                    break;
    
                case 2:
                    doDeleteItem();
                    break;
    
                case 3:
                    doUpdateItemPrice();
                    break;
    
                case 4:
                    doUpdateItemQuantity();
                    break;
    
                case 5:
                    doUpdateReOrderLevel();
                    break;
    
                case 6:
                    doPrintStockList();
                    break;
    
                case 7:
                    doPrintReOrderList();
                    break;
    
                case 8:
                    System.out.println("Thanks for using Stock List!");
                    System.exit(0);
                    break;
    
                default:
                    System.out.println("Invalid choice, please choose again");
                    doMenu();
            }
        }
       
    }

    // Obtain input for stock list operation
    // and invoke operation 
    private void doAddItem() 
    {
        String yesNo;

        System.out.println("Add new Item");
        System.out.println("************");

        System.out.print("Enter ID \t\t\t :> ");
        String itemID = scanIt.nextLine();

        System.out.print("Enter Description \t\t :> ");
        String itemDesc = scanIt.nextLine();

        System.out.print("Enter Price \t\t\t :> ");
        double price = scanIt.nextDouble();

        System.out.print("Enter quantity\t\t\t :> ");
        int quantity = scanIt.nextInt();

        System.out.print("Enter Re-Order Level\t\t :> ");
        int reOrderLevel = scanIt.nextInt();

        StockItem item = new StockItem(itemID, itemDesc, price, quantity, reOrderLevel);
        stock.addItem(item); //add to the list

        scanIt.nextLine();

        System.out.print("Enter another (Y/N) \t\t :> ");
        yesNo = scanIt.nextLine();


        if(yesNo == "y" || yesNo == "Y")
        {
            doAddItem();
        }
        else
        {
            doMenu(); //return back to menu
        }
        
    }

    private void doDeleteItem() 
    {
        System.out.println("Enter stock ID to delete :> ");
        String itemID = scanIt.nextLine();
        try 
        {
            stock.deleteItem(itemID);
        } 
        catch (ItemNotFoundException e) 
        {
            System.out.println(e.getMessage()); //task 7 ish
        }
    }

    private void doUpdateItemPrice()
    {
        System.out.println("Enter the stock ID to update your price :> ");
        String itemID = scanIt.nextLine();

        System.out.println("Enter your new price :> ");
        double newPrice = scanIt.nextDouble();
    }

    private void doUpdateItemQuantity() 
    {
        System.out.println("Enter stock ID to update quantity :> ");
        String itemID = scanIt.nextLine();

        System.out.println("Enter new quantity :> ");
        int newQuantity = scanIt.nextInt(); 

        stock.updateItemQuantity(itemID, newQuantity);
    }

    private void doUpdateReOrderLevel() 
    {
        System.out.println("Enter the stock ID in order to update the re-order level :> ");
        String itemID = scanIt.nextLine();

        System.out.println("Enter the new re-order level/quant :> ");
        int newReOrderLevel = scanIt.nextInt();
    
        stock.updateReOrderLevel(itemID, newReOrderLevel); //update the data
    }

    // Display contents of stock list
    private void doPrintStockList() 
    {
        System.out.println("\nCurrent Stock List");
        System.out.println("*******************");
        System.out.println(stock.formatStockList());
    }

    // Display contents of re-order list
    private void doPrintReOrderList() 
    {
        System.out.println("\nRe-Order Stock List");
        System.out.println("********************");
        System.out.println(stock.formatReOrderList());
    }

}