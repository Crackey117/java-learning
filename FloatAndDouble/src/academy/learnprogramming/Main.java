package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        float myFloatMin = Float.MIN_VALUE;
        float myFloatMax = Float.MAX_VALUE;
        System.out.println("Float max: " + myFloatMax);
        System.out.println("Float min: " + myFloatMin);

        double myDoubleMin = Double.MIN_VALUE;
        double myDoubleMax = Double.MAX_VALUE;
        System.out.println("double max: " + myDoubleMax);
        System.out.println("double min: " + myDoubleMin);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5.25d;

        double numPounds = 200d;
        double kilos = numPounds * .45349237;
        System.out.println("Converted kilos: " + kilos);
    }
}
