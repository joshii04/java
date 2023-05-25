package assignmentTwo;
import java.util.*;

public class StockItemTester2
{
   public static void main(String[]args)
   {
    StockItem2 item1  = new StockItem2("AB123", "x100 Paku", 1.00, 20, 30);
    StockItem2 item2 = new StockItem2("AC123", "x100 Rubber-Bands", 0.99, 50, 20);
    StockItem2 item3 = new StockItem2("Tt432", "x30 Screwdriver",56.00, 15, 13);

    System.out.println("\n--------------testing constructor-----------------\n");

    System.out.println(item1); //testing the constructor
    System.out.println(item2);

    // item1.getItemID("EW123");//testing the sets
    // item1.getItemDesc("x1 Hammer");

    System.out.println("\n--------------testing sets-----------------\n");

    item1.setPrice(9.00); //testing sets
    item1.setQuantity(10);
    item1.setReOrderLevel(10);
    System.out.println(item1); //test the toString method

    System.out.println("\n--------------testing gets-----------------\n");

    System.out.println("ID: "+item2.getItemID()); //testint the gets
    System.out.println("Description: "+item2.getItemDesc());
    System.out.println("Price: "+item2.getPrice());
    System.out.println("Quantity: "+item2.getQuantity());
    System.out.println("Re-order level: "+item2.getReOrderLevel()); 

    System.out.println("\n-----------testing toString and format-------------\n");
    System.out.println(item3); //tests the toString
    System.out.println(item3.format()+"\n"); //toSting
   }
}
