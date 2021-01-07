package academy.learnprogramming;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static int sumReader(){
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10){
                    break;
                }
            }else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }
        scanner.close();
        return sum;
    }
}
