/* Author: Joshua Sinclair
   File: Player.java
   Created on: 06/03/2023
   Version: 1.0 */

public class Player
{
    private int score;

    public Player(int initialScore)//constructor
    {
       this.score = initialScore;
    }
    
    public Player()
    {
        this.score = 0;
    }

    public void setScore(int points) //access method to return value of a players score
    {
        this.score += points; //increment the score of a player each time it is called
    }

    public int getScore()
    {
        return this.score;
    }

    //to string and format not required


}