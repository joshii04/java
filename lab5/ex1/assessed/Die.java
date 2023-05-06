/* Author: Joshua Sinclair
   File: Die.java
   Created on: 06/03/2023
   Version: 1.0 */


import java.util.*; // imports all the tools from here 

public class Die
{

    private int faceValue;
    private int sides;

    public Die(int sides) //construct
    {
        this.faceValue = faceValue;
        this.sides = sides;
        Random randomNum = new Random();
        this.faceValue=randomNum.nextInt(sides)+1; //random num gen
    }

    public void throwDie()
    {
        Random randomNum = new Random(); //base random number gen 
        this.faceValue=randomNum.nextInt(sides)+1; //ranging from 1 to sides
    }

    public int getFaceValue() //get
    {
        return this.faceValue;
    }

    public int getSides()
    {
        return this.sides;
    }

    //string method
    public String toString()
    {
        return"[faceValue= " +getFaceValue() + " sides= "+getSides()+"]";
    }
}

