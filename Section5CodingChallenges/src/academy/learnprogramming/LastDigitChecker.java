package academy.learnprogramming;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int one, int two, int three){
        if(!isValid(one) || !isValid(two) || !isValid(three)){
            return false;
        }
        int oneRightDigit = one % 10;
        int twoRightDigit = two % 10;
        int threeRightDigit = three % 10;
        if(oneRightDigit == twoRightDigit || oneRightDigit == threeRightDigit || twoRightDigit == threeRightDigit){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }else {
            return true;
        }
    }
}
