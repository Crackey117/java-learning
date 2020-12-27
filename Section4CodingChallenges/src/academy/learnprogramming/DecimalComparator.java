package academy.learnprogramming;


public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        double tempOne = one * 1000;
        double tempTwo = two * 1000;
        int roundedOne;
        int roundedTwo;
        if(tempOne > 0){
            roundedOne = (int) Math.floor(tempOne);
        }else{
            roundedOne = (int) Math.ceil(tempOne);
        }
        if(tempTwo > 0){
            roundedTwo = (int) Math.floor(tempTwo);
        }else{
            roundedTwo = (int) Math.ceil(tempTwo);
        }
        if(roundedOne == roundedTwo){
            return true;
        }
        return false;
    }
}
