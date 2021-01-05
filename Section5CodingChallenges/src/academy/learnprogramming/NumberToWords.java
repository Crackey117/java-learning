package academy.learnprogramming;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int reverse = reverse(number);
        int originalLength = getDigitCount(number);
        int reversedLength = getDigitCount(reverse);

        if(reverse == 0){
            System.out.println("Zero");
        }else {
            while (reverse > 0) {

                int word = reverse % 10;

                switch (word) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverse /= 10;
            }
            if(!(originalLength == reversedLength)){
                int difference = originalLength - reversedLength;
                for(int i = difference; i > 0; i--){
                    System.out.println("Zero");
                }
            }
        }
    }
    public static int reverse(int number){
        int reverse = 0;
        int temp = number;
        while(temp != 0){
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp /= 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int intLength = String.valueOf(number).length();

        return  intLength;
    }
}
