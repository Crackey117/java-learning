package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        int pw = 642332;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(-1);
        password.letMeIn(1343);
        password.letMeIn(0);
        password.letMeIn(642332);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);


    }
}
