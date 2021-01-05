package academy.learnprogramming;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }else{
            int sum = 0;
            int temp = 1;
            while(temp < number){
                if(number % temp == 0){
                    sum += temp;
                }
                temp++;
            }
            if(sum == number){
                return true;
            } else {
                return false;
            }
        }
    }
}
