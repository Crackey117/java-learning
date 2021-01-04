package academy.learnprogramming;

public class SharedDigit {
    public static boolean hasSharedDigit(int one, int two){
        if((one < 10 || one > 99) || (two < 10 || two > 99)){
            return false;
        }
        int oneFirstDigit = one % 10;
        int oneSecondDigit = (one / 10);
        int twoFirstDigit = two % 10;
        int twoSecondDigit = two / 10;
        if(oneFirstDigit == twoFirstDigit || oneFirstDigit == twoSecondDigit || oneSecondDigit == twoSecondDigit){
            return true;
        }else {
            return false;
        }
    }
}
