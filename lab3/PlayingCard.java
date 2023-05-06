/*Author: Joshua Sinclair
Title: PlayingCard.java 
WorldCreated: 09/02/2023
Version: 1.0*/


public class PlayingCard
{
    private int suit; 
    private int rank;
    public final int clubs = 0;
    private static int count = 0;
    
       /**
       @author Joshua Sinclair
        */

    String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}; //array with these values to be called
    String[] suits = {"Clubs","Diamonds","Hearts","Spades"};

    /**
    Used to create construcor for a PlayingCard
    @param rank
    @param suit
    @param PlayingCard
    @return none
     */

    public PlayingCard(int rank, int suit)
    {

        if (rank < 1){
            System.out.println("Card Values start at 1 you pleb");
            return;
        }
        this.rank = rank;
        this.suit = suit;

        count++;

        
    }
 
    public int getSuit()
    {
        return this.suit;
    }
    /**
    @param newSuit 
    type integer
    0 = clubs, 1 = Diamonds, 2 = hearts, 3 = spades */
    public void setSuit(int newSuit)
    {
        this.suit = newSuit;
    }

    public int getRank()
    {
        return this.rank;
    }

    /**
    @param newRank
    type integer 
    creates new rank, 1 = ace, 11 = jack, 12 = queen, 13 = king, */
    public void setRank(int newRank)
    {
        this.rank = newRank;
    }

/**
checks against the card
@return equals
 */
    public boolean equals(Object otherObjects) //check if equals card
    {
        if(otherObjects instanceof PlayingCard) 
        {
            PlayingCard p = (PlayingCard) otherObjects;

            if(this.getRank() == p.getRank())
            {
                if(this.getSuit() == p.getSuit())
                {
                    return true;
                }
            } 
        }

        return false; //output here if no nested if conditions are met
    }

    /**
    Used to create a String format when getting rank and suit
    @return String
    */
    
    public String format() //nice formated class
    {
        return String.format("%s of %s ", this.ranks[getRank()-1], this.suits[getSuit()]); //return a value if there is no void in the method
    }

    /**
    Creates the test string format for the PlayingCard
    @return String
     */
    public String toString() //testing format
    {
        return "Playing card [Rank="+this.ranks[getRank()-1]+" Suit="+this.suits[getSuit()]+"]"; //get from array
    }
}