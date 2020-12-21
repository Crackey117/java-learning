package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myVariable = 50;
	    myVariable++;
	    myVariable--;
        System.out.println("This is a test");

        System.out.println("THis is " +
                " another" +
                " and still more.");
        //bad format that java will still read
        int anotherVariable = 50;myVariable--;System.out.println("Third statement on the same row");
    }
}
