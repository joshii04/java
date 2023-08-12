import java.util.Scanner;

public class InputTester{
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Please guess a number between 1 and 5 :> ");
        int number = in.nextInt();

        if(number == 2){
            System.out.println("you are a magician");
        }
        else{
            System.out.println("Wrong, you suck");
        }
    }
}