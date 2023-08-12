public class BankAccount{

    private double balance;
    private String name;
    private String number;

    public BankAccount(String name, String number, double balance){
        this.balance = balance;
        this.name = name;
        this.number = number;
    }

    public void depositMoney(double newDeposit){
        this.balance += newDeposit;
        // increment balance
        System.out.println("deposit success, new balance: "+this.balance);
    }

    public void withdraw(double newWithdraw){
        if(this.balance - newWithdraw < 0){
            System.out.println("withdraw unsucessful because only "+ this.balance+" is left" );
        }
        else{
            this.balance -= newWithdraw;
            System.out.println("Current balance is "+this.balance);
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String newNumber){
        this.number = newNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String toString(){
        return "Name: "+getName()+"|| Number: "+getNumber()+"|| Balance: "+getBalance();
    }

}