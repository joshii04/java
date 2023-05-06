public class BankAccount
{

    private double balance;
    private String name;

    public BankAccount(String name, double balance) //constructor
    {
        this.balance = balance;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
   
}