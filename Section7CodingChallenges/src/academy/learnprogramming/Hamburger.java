package academy.learnprogramming;



public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;

    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1 = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2 = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3 = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4 = name;
        this.addition4Price = price;
    }

    public double itemizedHamburger() {
        double hamburgerPrice = this.basePrice;
        System.out.println(this.name + " hamburger, with " + this.meat + " on a " + this.breadRollType + " roll, and the price is " + this.basePrice);
        if(this.addition1 != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1 + " for an extra " + this.addition1Price);
        }
        if(this.addition2 != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2 + " for an extra " + this.addition2Price);
        }
        if(this.addition3 != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3 + " for an extra " + this.addition3Price);
        }
        if(this.addition4 != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4 + " for an extra " + this.addition4Price);
        }
        return  hamburgerPrice;
    }

}


