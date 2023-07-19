
public class suitCaseTester {
    public static void main(String[]args){

        SuitCase case1 = new SuitCase("red",4);

        System.out.println(case1.format());

        case1.setWheels(3);

        System.out.println(case1.format());
    }
}
