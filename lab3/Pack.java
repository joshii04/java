/*Author: Joshua Sinclair
Title: Pack.java 
WorldCreated: 09/02/2023
Version: 1.0*/

import java.util.*; //import all from this library

/**

Creates the pack of cards
@author Joshua Sinclair
 */

public class Pack
{
    ArrayList<PlayingCard> cards = new ArrayList<PlayingCard>(); 
    /**
     *instantiates new array list
    */
/**
returns the PlayingCard being populated into the deck
@return Pack*/

    public Pack()
    {
        for(int j = 0; j < 4;j++) //increment up in the suit 
        {
            
            for(int i = 1; i < 14; i++) //the increment the rank
            {
                PlayingCard c = new PlayingCard(i,j);
                cards.add(c);
                /**
                *creates playing card in pack
                */
            }

        }

        //when this is done start the next suit etc

    }

    /**
 * Shuffles cards in pack.
 */ 
    public void shuffle()
    {
        Collections.shuffle(this.cards); //shuffle the cards pack
    }
 
 /**
 * @return string representation of 52 card pack.
 */
    public String toString()
    {
        for(PlayingCard pc: this.cards)
        {
            System.out.println(pc); //print the toString format for the cards
        }
        return "-------Now, shuffle or end--------"; //having fun
    } 
}