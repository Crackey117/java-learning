package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //array lists cannot be of primitive data types
        //ArrayList<int> intArrayLIst = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(544));
        Integer integer = new Integer(544);
        Double doubleValue = new Double(2.53);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        //value of takes int value of i and turns it into the class Integer
        for(int i = 0; i <= 10; i++ ){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i = 0; i <= 10; i++ ){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
        //the line below is converted to Integer.valueOf(56) at compile time
        Integer myIntValue = 56;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl+=0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for(int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " ---> " + value);
        }
    }
}

class IntClass {
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue){
        this.myValue = myValue;
    }
}