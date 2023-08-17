
public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    // ^ this is only native to this class (only for dogs)

    public Dog(String name, int brain, int size, int weight, int eyes, int legs, int tail){
        super(name, brain, size, weight); 
        //^ these keywords are inherited from the parent class

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }

    public void chew(){
        System.out.println("Dog.chew() is called");
        
    }

    public int getEyes(){
        return eyes;
    }

    public int getLegs(){
        return legs;
    }

    public int getTail(){
        return tail;
    }
}
