/*Author: Joshua Sinclair
Title: PlayingCardTester.java 
WorldCreated: 09/02/2023
Version: 1.0*/

public class PlayingCardTester
{
    /**
    Tests all of the methods in PlayingCard 
    @author Joshua Sinclair
     */
     
    public static void main(String[]args)
    {
        PlayingCard card1 = new PlayingCard(2, 0);
        PlayingCard card2 = new PlayingCard(13, 1);
        PlayingCard card3 = new PlayingCard(7, 2);
        PlayingCard card4 = new PlayingCard(1, 3);
        
        /*tester*/
        System.out.println("\n Tesing setters for playing card...");
        PlayingCard card5 = new PlayingCard(1, 0); //set to 0 0 and then pass the new test values in below
        
        
        /*User that cand use cards*/
        System.out.println("\n Tesing outof bouds for playing card...");
        PlayingCard card6 = new PlayingCard(0, 0);

        System.out.println(card5);

        card5.setRank(11); //pass in these values via hard testing
        card5.setSuit(2);

        System.out.println(card5); //this is the test card 
        /*tester*/

         System.out.println("\n Tesing getters for playing card...");
        int testcardR = card5.getRank();
        int testcardS = card5.getSuit();
        System.out.println(card5);
        System.out.println(testcardR);
        System.out.println(testcardS);


        System.out.println("\nTesing playing card constrcutor...");
        System.out.println(card1.format()); //nice format
        System.out.println(card2.format());
        System.out.println(card3.format());
        System.out.println(card4.format());
    
        Pack p = new Pack();
        System.out.println(p.toString());//this refers to the pack via local variable in the constructor
        p.shuffle();//this will shuffle the array, and sort in a different/random way/
        System.out.println(p.toString()); //these are the shuffled array list of cards in the pack

 
    }
}