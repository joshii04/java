/* Author: Joshua Sinclair
   File: PlayerTester.java
   Created on: 06/03/2023
   Version: 1.0 */

public class PlayerTester
{
    public static void main(String[]args)
    {
        Player player1 = new Player(0); //score for player1
        Player player2 = new Player(0);

        System.out.println(player1.getScore());//get initial score
        System.out.println(player2.getScore());

        player2.setScore(1);
        System.out.println(player2.getScore()); //gets new initialised scores
        
        player2.setScore(4);
        System.out.println(player2.getScore()); //shows that the adding score works

        player1.setScore (3);
        System.out.println(player1.getScore()); //check that player 1 also adds
        
    }
}