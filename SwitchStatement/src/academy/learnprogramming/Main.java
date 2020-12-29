package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    int value = 1;

	    switch(value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case5:
                System.out.println("value was 3, 4, or 5");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char charValue = 'A';
	    switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("A was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("A was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or EE");
                break;
        }
        String month = "JuNe";
	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
            case "june":
                System.out.println("Jun");
            default:
                System.out.println("Not sure");
        }
        printDayOfTheWeek(2);

    }
    static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid day number");
        }
    }
}
