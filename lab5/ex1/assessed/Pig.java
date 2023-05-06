/* Author: Joshua Sinclair
   File: Pig.java
   Created on: 06/03/2023
   Version: 1.0 */

import java.util.*;

public class Pig
{
    public static void main(String[]args)
    {
        Die die1 = new Die(6);
        Scanner myScan = new Scanner(System.in); //choice input objects
        
        Player player1 = new Player(0);
        Player player2 = new Player(0);
        ArrayList<Player> players = new ArrayList<Player>();

        players.add(player1);
        players.add(player2);

        //Player presentPlayer = player1;

        System.out.println("---------------------------------------------");
        System.out.println("        Both players will start at "+ player1.getScore());//not really needed
        System.out.println("---------------------------------------------");

        boolean gameDone = false;

        while(!gameDone) //any player with less then 100 keep going util condition is met 
        {
            //die1.throwDie();//throws 
            //System.out.println("First roll for player 1 is "+die1.getFaceValue());//gets fv

                //player1.setScore(die1.getFaceValue());

             int tmpScore = 0;

             for(int num=0; num<players.size(); num++)
             {
               
                int choice = 1;

                while(choice != -1)// whilst true
                {
                    System.out.println("--------------------------------------");
                    System.out.println(   "    Current Player is: Player " + num); //counter of the index, so that it can itterate/swap between players
                    System.out.println("--------------------------------------");
                    System.out.println("--------------------------------------");
                    System.out.println("-       Please select your move      -");
                    System.out.println("--------------------------------------");
        
                    System.out.println("--------------------------------------");
                    System.out.println("-     (0) to hold || (1) to roll     -");
                    System.out.println("--------------------------------------\n\n");
                    
                    System.out.println("******************");
                    System.out.println("Enter your choice:");
                    System.out.println("******************");

                    choice = myScan.nextInt(); //takes in value of the player
                    
                    if(choice == 0)
                    {
                        players.get(num).setScore(tmpScore);//gettin the face value of the dice and adding it to player 1 score
                        System.out.println("*******************************************");
                        System.out.println("^ ^ ^  Previous player score is: ^ ^ ^ : " + players.get(num).getScore()); //adding the index the storing
                        System.out.println("*******************************************");
                        tmpScore = 0;
                        choice = -1;

                        if(players.get(num).getScore() >= 100)
                        {
                             gameDone = true;
                            System.out.println("Player has reached 100!");
                             break;
                        } 
                    }
                    else
                    {
                        die1.throwDie(); //calls the throw method

                        if(die1.getFaceValue() == 1)
                        {
                            System.out.println("You rolled a 1, you get 0");
                            tmpScore = 0;//then after gets added 
                            break; //exits loop
                        }
                        else
                        {
                            tmpScore = tmpScore + die1.getFaceValue(); //current value plus cal given/rolled //adds up
                            System.out.println("You Rolled: " + die1.getFaceValue()); //prints dice value
                            System.out.println("Your total score is now: " + tmpScore);//adds the score from the dice
                        }
                    }
                }

                
            }


            
          
    
            
               
           


            
        

        }
    }
}