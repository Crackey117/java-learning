package academy.learnprogramming;

public class DogMain {

    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");
        //mark equal as final so it cannot be overridden in subclasses
        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }
}
