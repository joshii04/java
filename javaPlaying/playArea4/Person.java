public class Person{

    private int eyes;
    private int ears;
    private String hair;
    private int nose;

    public Person(int eyes, int ears, String hair, int nose){
       
        this.eyes = eyes;
        this.ears = ears;
        this.hair = hair;
        this.nose = nose;

    }

    public void eat(){

    }

    public void move(){

    }

    public int getEyes(){
        return eyes;
    }

    public int getEars(){
        return ears;
    }

    public String getHair(){
        return hair;
    }

    public int getNose(){
        return nose;
    }

    public String toString(){
        return "[ Eyes: ]"+getEyes()+" Ears: "+getEars()+" Hair: "+getHair()+" Nose: "+getNose()+" ]";
    }


}