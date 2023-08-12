import java.util.Scanner;


public class bankAccountTester{
   public static void main(String[]args){

        BankAccount joshAccount = new BankAccount("Josh", "CA12345", 0);

        joshAccount.depositMoney(100);
        joshAccount.depositMoney(150);
        joshAccount.withdraw(200);
        // System.out.println(joshAccount);
   }



} 