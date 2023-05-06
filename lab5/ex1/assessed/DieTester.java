/* Author: Joshua Sinclair
   File: DieTester.java
   Created on: 06/03/2023
   Version: 1.0 */

import java.util.*;

public class DieTester
{
    public static void main(String[]args)
    {
        Die dice1 = new Die(6); //set the sides of the dice
        System.out.println(dice1); //print values in the construct

        Die dice2 = new Die(8); //testing the constructor values are passed through correctly
        System.out.println(dice2.toString()); //testing the to string class

        int testDiceFV = dice2.getFaceValue();
        int testDiceSD = dice2.getSides();
        System.out.println(testDiceFV + " fave value (dice2)"); //tests get method for face value
        System.out.println(testDiceSD + " sides (dice2)"); //tests get method for sides

        



    }
}