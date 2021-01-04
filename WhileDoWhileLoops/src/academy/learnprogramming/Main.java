package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count != 6) {
            System.out.println("Count is " + count);
            count++;
        }
        while(true) {
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 4;
        do {
            System.out.println("Count value was " + count);
            count++;
            if(count > 100){
                break;
            }
        } while(count !=6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                evenNumbers++;
                continue;
            }
            System.out.println("Even number " + number);
            if(evenNumbers == 5){
                break;
            }


        }
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
