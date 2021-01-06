package academy.learnprogramming;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number < 0){
            return -1;
        }else {
            int temp = number;
            boolean primeFound = false;
            while(temp > 1 && primeFound == false){
                if(number % temp == 0){
                    int primeChecker = 2;
                    boolean notAPrime = false;
                    while(primeChecker < temp && notAPrime == false){
                        if(temp % primeChecker == 0){
                            notAPrime = true;
                        }
                        primeChecker++;

                    }
                    if(notAPrime == false){
                        primeFound = true;
                    }else{
                        temp--;
                    }
                }else{
                    temp--;
                }
            }
            if(primeFound == true){
                return temp;
            }else{
                return -1;
            }
        }
    }
}
