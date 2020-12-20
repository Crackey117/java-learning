package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("my string is equal to " + myString);
        myString = myString + ", and this is more. \u00A9 2019";
        System.out.println("mystring is equal to " + myString);
        String numberString = "205.55";
        numberString = numberString + "40.99";
        System.out.printf(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("last string = " + lastString);

    }
}
