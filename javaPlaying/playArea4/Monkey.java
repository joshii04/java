public class Monkey extends Person{

    private String furColour;

    public Monkey(int eyes, int ears, String hair, int nose, String furColour){
        super(eyes, ears, hair, nose);

        this.furColour = furColour;
    }

    public String getFurColour(){
        return furColour;
    }

    public void chew(){
        System.out.println("Chew is called");
    }

    @Override
    public void eat(){
        super.eat();
        chew();
        //this is the parent class method that I have brought in to this class
    }

    public String toString(){
        return "[ Eyes: ]"+getEyes()+" Ears: "+getEars()+" Hair: "+getHair()+" Nose: "+getNose()+" Fur colour: "+getFurColour()+ "]";
    }

}