package assignmentTwo;

import java.util.*;
import java.io.*;

public class StockListCLI2
{
    private StockList2 stock = null; 
    //why null? 

    private Scanner scanIt;

    public StockListCLI2(StockList2 stock) //input the stockList2
    {
        this.stock = stock; //scanner 
        scanIt = new Scanner(System.in);
    }


}
