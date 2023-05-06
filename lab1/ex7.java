package lab1;

import java.util.Scanner;

public class ex7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 

        System.out.print("Enter a Number :> "); // prompt the user for input
        int number = in.nextInt(); //read value from keyboard

        if(number == 0)
        {
            System.out.print("Thanks for playing, see ya");
        }
        else
        {
            System.out.print("You entered "+number);
        }

        
    }
}
