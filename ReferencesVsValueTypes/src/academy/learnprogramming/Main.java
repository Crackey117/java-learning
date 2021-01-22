package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntvalue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntvalue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        anotherArray[0] = 1;

        System.out.println("myIntArray after change = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after change = " + Arrays.toString(anotherArray));
        anotherArray = new int[] {5, 6, 7, 8, 9};
        modifyArray(myIntArray);

        System.out.println("myIntArray after modify = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after modify = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        //below will create a new array, the reference now points to this new array
        array = new int[] {1, 3, 4, 5, 6};
    }
}
