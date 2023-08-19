public class Main{
    public static void main(String[]args){
        Bmw bmw = new Bmw("BMW", 4, 6, "yoke");
        Car ford = new Car("ford", 4, 6);

        System.out.println(bmw);
        bmw.rev();
        System.out.println(ford);

    }
}