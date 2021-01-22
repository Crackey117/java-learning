package academy.learnprogramming;

import java.util.Scanner;

public class ResizeArraryExample {
    public static void resizeArray(){
        Scanner scanner = new Scanner(System.in);
        int[] baseData = new int[10];
        System.out.println("Enter 10 integers");
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = scanner.nextInt();
        printArray(baseData);
        int[] original = baseData;
        baseData = new int[12];
        for(int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
        System.out.println("enter 12 integers");
        baseData[10] = 67;
        baseData[11] = 75;
        printArray(baseData);


    }
    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}
