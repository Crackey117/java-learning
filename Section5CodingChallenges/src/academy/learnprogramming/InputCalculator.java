package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;
        while(true){
            boolean isAntInt = scanner.hasNextInt();
            if(isAntInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else {
                break;
            }
        }
        if(sum < 0){
            average = -1 * ((Math.abs(sum) + count - 1)/count);
        }else if (sum > 0) {
            average =  ((sum + count - 1)/ count);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();

    }

}
