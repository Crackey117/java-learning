package academy.learnprogramming;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        sum += number % 10;
        do{
            if(number / 10 == 0){
                sum += number;
                number /= 10;
            }else {
                number /= 10;
            }
        }while(number != 0);
        return sum;
    }
}
