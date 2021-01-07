package academy.learnprogramming;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void minAndMaxReader(){

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        // alternatively
        // max = -2147483648
        // min = 2147483647
        // or
        // max = Integer.MIN_VALUE
        // min = Integer.MAX_VALUE
        boolean first = true;
        while(true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    max = number;
                    min = number;
                    first = false;
                }
                if(number > max){
                    max = number;
                }else if (number < min){
                    min = number;
                }
            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max = " + max + " and Min = " + min);
        scanner.close();
    }
}
