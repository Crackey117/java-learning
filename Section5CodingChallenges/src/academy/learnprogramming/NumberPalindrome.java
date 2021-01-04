package academy.learnprogramming;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;
        while(temp != 0){
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp /= 10;
        }
        if(reverse == number){
            return true;
        }else {
            return false;
        }
    }
}
