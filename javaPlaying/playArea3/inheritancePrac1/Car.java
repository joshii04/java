public class Car{

    private int wheels;
    private int windows;
    private String brand;

    public Car(String brand, int wheels, int windows){
        this.brand = brand;
        this.windows = windows;
        this.wheels = wheels;
    }

    public String getBrand(){
        return brand;
    }

    public int getWheels(){
        return wheels;
    }

    public int getWindows(){
        return windows;
    }


    public String toString(){
        return "[brand: "+getBrand()+" | wheels: "+getWheels()+ "| windows: "+getWindows();
    }

}