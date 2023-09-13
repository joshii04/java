public class Main{
    public static void main(String[]args){
        Person newPerson = new Person(2, 2, "blonde", 1);
        Monkey cheekyMonkey = new Monkey(2, 2, "orange", 1, "orange");

        System.out.println(newPerson);
        System.out.println(cheekyMonkey);
        cheekyMonkey.eat();

    }
}