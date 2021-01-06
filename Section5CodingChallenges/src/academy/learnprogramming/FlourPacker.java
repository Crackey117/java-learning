package academy.learnprogramming;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int maxBig = goal / 5;
        int min = maxBig < bigCount ? maxBig : bigCount;
        int bc = goal - (min * 5);
        return (bc <= smallCount);
    }
}
