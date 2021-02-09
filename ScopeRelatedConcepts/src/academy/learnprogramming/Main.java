package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String priavteVar = "this is private to main()";

	    ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());

        System.out.println(priavteVar);

        scopeInstance.timesTwo();
        System.out.println("*****");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
        scopeInstance.useInner();

        //Scope Challenge

        X x = new X(new Scanner(System.in));
        x.x();
    }
}
