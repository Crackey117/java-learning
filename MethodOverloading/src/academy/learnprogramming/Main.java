package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        int secondScore = calculateScore(75);
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(100);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0 )|| ((inches < 0) && (inches > 12))){
            return -1;
        }
        double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
        System.out.println(feet + " feet, " + inches + " inches is " + centimeters + " centimeters.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            System.out.println("Invalid inches parameter");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);


    }


}
