package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous result: " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previous result = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2*10= " + result);

        result = result / 5; //20 / 5 = 4
        System.out.println("20/5 = " + result);

        result = result % 3; //remainder = (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        result++; //1 + 1 = 2
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println((result));

        result *= 10;
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("it is not an alien!");
            System.out.println("and I am scared of aliens");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("you got the high score!");
        }
        int secondTopSCore = 81;
        if (topScore > secondTopSCore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }
        if((topScore > 90) || (secondTopSCore <= 90)) {
            System.out.println("Either or both conditions true");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println(("not a car"));
        }

        boolean  wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        if (isEighteenOrOver){
            System.out.println("client is over 18 years old");
        }

        double myDouble = 20.00;
        double secondDouble = 80.00;
        double thirdDouble = (myDouble + secondDouble) * 100;
        double remaineder = thirdDouble % 40.00;
        boolean noRemaineder = (remaineder == 0) ? true : false;
        System.out.println(noRemaineder);
        if(!noRemaineder){
            System.out.println("Got some remainder");
        }
    }
}
