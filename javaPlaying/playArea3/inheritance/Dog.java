
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

    @Override
    public void eat(){
        super.eat();
        chew();
        //this is the parent class method that I have brought in to this class
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

    public String toString(){
        return "name: "+getName()+" brain: "+getBrain()+" size: "+getSize()+"weight: "+getWeight()+"eyes: "+getEyes()+"Legs: "+getLegs()+"tail: "+getTail();
    }
}
