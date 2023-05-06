/*Author: Joshua Sinclair
Title: StockApp.java 
WorldCreated: 23/04/2023
Version: 1.0*/

public class StockListApp 
{
    public static void main(String[] args)
    {
        
        StockList stockList = new StockLinkedList(); //create sl obj

       
        if (args.length > 0) //if no args print save.dat
        {
            stockList.loadStockData(args[0]);// print the desired file
        }

        else 
        {
            stockList.loadStockData("save.dat");
            //use save.dat as the file to pull from
        }

        // Create an interface
        StockListCLI stockListCLI = new StockListCLI(stockList);
        // Display the menu
        stockListCLI.doMenu();
    }   
}
