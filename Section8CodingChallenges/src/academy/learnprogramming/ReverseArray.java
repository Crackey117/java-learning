package academy.learnprogramming;

import java.util.Arrays;

public class ReverseArray {

    public static void runReverseArray() {
        int[] array = {1 , 5, 6, 78, 3 , 5};
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(array));

    }
    private static void reverse(int[] array){
        int maxIndex = array.length -1;
        System.out.println("Array = " + Arrays.toString(array));
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
