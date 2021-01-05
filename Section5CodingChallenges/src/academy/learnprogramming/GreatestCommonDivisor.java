package academy.learnprogramming;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int one, int two){
        if(one < 10 || two < 10){
            return -1;
        }
        int base = 0;
        if(one > two){
            base = two;
        } else {
            base = one;
        }
        while(base > 0){
            if(one % base == 0 && two % base == 0 ){
                return base;
            }
            base--;
        }
        return -1;
    }
}
