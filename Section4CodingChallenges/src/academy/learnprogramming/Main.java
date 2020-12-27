package academy.learnprogramming;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	    SpeedConverter.printConversion(10.5);
	    MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
	    boolean wakeUp = BarkingDog.shouldWakeUp(true, 9);
        System.out.println(wakeUp);
        boolean leapYear = LeapYear.isLeapYear(1924);
        System.out.println(leapYear);
        boolean equal = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(equal);
        boolean sumEqual = EqualSumChecker.hasEqualSum(1,2, 3);
        System.out.println(sumEqual);

        boolean teenCheck = TeenNumberChecker.hasTeen(20, 23, 19);
        System.out.println(teenCheck);
    }
}
