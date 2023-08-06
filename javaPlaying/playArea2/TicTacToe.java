import java.util.Scanner;

public class TicTacToe{
    
    public static void main(String[]args){

        char [] [] board = {{' ',' ',' '},
                            {' ',' ',' '},
                            {' ',' ',' '}};

                        //^ this is the 2d array board 

        printBoard(board);  

        Scanner scanner = new Scanner(System.in);
        // ^ scanner object 

      

        switch(userInput){
            case "1":
                board[0][0] = 'x';
                break;
            case "2":
                board[0][1] = 'x';
                break;   
            case "3":
                board[0][2] = 'x';
                break;     
            case "4":
                board[1][0] = 'x';
                break;
            case "5":
                board[1][1] = 'x';
                break;   
            case "6":
                board[1][2] = 'x';
                break; 
            case "7":
                board[2][0] = 'x';
                break;
            case "8":
                board[2][1] = 'x';
                break;   
            case "9":
                board[2][2] = 'x';
                break;
            default:
                System.out.println("That was not a valid option");               
        }

        printBoard(board);

    }

    private static void printBoard (char[][] board) {

        System.out.println(" ");
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);  
        System.out.println("-+-+-");    
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);  
        System.out.println("-+-+-");                
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println(" ");

    }

    private static void getUserIn (board, scanner){
        
    }

        System.out.println("What position would you like to play? 1-9 (left to right)");

        String userInput = scanner.nextLine();

        System.out.println(userInput);
}