public class Bmw extends Car{

    private String yoke;

    public Bmw(String brand,  int wheels, int windows, String yoke){
        super(brand, wheels, windows);
        // ^ this states that this is the super class

        this.yoke = yoke;
        // ^ local instantiation
    }

    public String getYoke(){
        return yoke;
    }

    public void rev(){
        System.out.println("vrmrmmmmmmmm");
    }

    public String toString(){
        return "[brand: "+getBrand()+" | wheels: "+getWheels()+ "| windows: "+getWindows()+"| steering wheel: "+getYoke();
    }

}