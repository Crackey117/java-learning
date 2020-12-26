package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    SpeedConverter.printConversion(10.5);
	    MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
	    boolean wakeUp = BarkingDog.shouldWakeUp(true, 9);
        System.out.println(wakeUp);
        boolean leapYear = LeapYear.isLeapYear(1924);
        System.out.println(leapYear);
    }
}
