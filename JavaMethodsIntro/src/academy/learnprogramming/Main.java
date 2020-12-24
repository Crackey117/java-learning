package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was: " + highScore);
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was: " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tim", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }else{
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println("Player " + name + " managed to make position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score){
        //if(score >= 1000){
        //    return 1;
        //}else if (score >= 500) {
        //    return 2;
        //}else if (score >= 100){
        //    return 3;
        //}
        //return 4;
        int position = 4;

        if(score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
