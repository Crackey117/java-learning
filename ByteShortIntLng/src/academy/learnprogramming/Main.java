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

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value: " + myMinByteValue);
        System.out.println("Byte max value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value: " + myMinShortValue);
        System.out.println("Short max value: " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long min value: " + myMinlongValue);
        System.out.println("long max value: " + myMaxlongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue /2);
        short myNewSHortValue = (short) (myMinShortValue / 2);
    }
}
