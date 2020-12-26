package academy.learnprogramming;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay > 23 || hourOfDay < 0){
            return false;
        }else if((hourOfDay > 22 || hourOfDay < 8) && barking){
            return true;
        }else {
            return false;
        }
    }
}
