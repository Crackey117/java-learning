package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //bedroom challenge
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

        //printer challenge

        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        //car challenge
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        //section challenge - bills burgers
        Hamburger hamburger = new Hamburger("Basic", "white","Sausage",  3.56);
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Cheese", 0.25);
        hamburger.addHamburgerAddition3("Lettuce", 0.75);
        double price = hamburger.itemizedHamburger();
        System.out.println("Total is " + price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("egg", .85);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        double healthyPrice = healthyBurger.itemizedHamburger();
        System.out.println(healthyPrice);
        DeluxeBurger db = new DeluxeBurger();
        db.itemizedHamburger();
        db.addHamburgerAddition1("this shouldnt work", 0.0);

    }
}
