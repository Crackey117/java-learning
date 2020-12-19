package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min: =" + myMinIntValue);
        System.out.println("Integer Max: =" + myMaxIntValue);
        System.out.println("Busted Max value: =" + (myMaxIntValue + 1));
        System.out.println("Busted Min value: =" + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647;
    }
}
