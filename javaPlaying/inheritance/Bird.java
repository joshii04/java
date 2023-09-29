public class Bird{

    private String name;
    private int wings;
    private int legs;

    public Bird(String name, int wings, int legs){
        this.name = name;
        this.wings = wings;
        this.legs = legs;
    }

    public String getName(){
        return name;
    }

    public int getWings(){
        return wings;
    }

    public int getLegs(){
        return legs;
    }

    public void eat(){

    }
    // this is just so it can be used in later classes

    public void move(){

    }

    public String toString(){
        return "[ Name: "+getName()+" Wings: "+getWings()+" Legs: "+getLegs()+"]";
    }

}
