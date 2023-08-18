public class Main{
    public static void main(String[]args){
        Dog dog = new Dog("Josh", 1, 1, 10, 2, 4, 1);
        dog.eat();

        Bird bird = new Bird("Tweetie", 1, 1, 2, 2, 2, 2);

        System.out.println(dog);
        System.out.println(bird);

    }
}

