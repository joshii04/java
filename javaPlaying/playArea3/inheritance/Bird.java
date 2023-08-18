public class Bird extends Animal{
   
    private int legs;
    private int eyes; 
    private int wings;
   
    public Bird(String name, int brain, int size, int weight, int eyes, int legs, int wings){
        super(name, brain, size, weight); 
        //^ these keywords are inherited from the parent class

        this.eyes = eyes;
        this.legs = legs;
        this.wings = wings;

        //^this adds on the local variables to the constructor
    }   

    public int getEyes(){
        return eyes;
    }

    public int getLegs(){
        return legs;
    }

    public int getWings(){
        return wings;
        // ^ for all of the new variables you need to write gets
    }


    public String toString(){
        return "name: "+getName()+" brain: "+getBrain()+" size: "+getSize()+"weight: "+getWeight()+"eyes: "+getEyes()+"Legs: "+getLegs()+"WINGS: "+getWings();
    }
}