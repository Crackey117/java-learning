package academy.learnprogramming;

import java.util.Map;

public class Main {
    private static  StockList stockList = new StockList();
    public static void main(String[] args) {
	    StockItem temp = new StockItem("Bread", .86, 100);
	    stockList.addStock(temp);

	    temp = new StockItem("Cake", 1.20, 7);
        stockList.addStock(temp);
        temp = new StockItem("Cake", 1.20, 7);
        stockList.addStock(temp);
        temp = new StockItem("Car", 70.10, 2);
        stockList.addStock(temp);
        temp = new StockItem("Hot sauce", 1.20, 5);
        stockList.addStock(temp);
        temp = new StockItem("Phone", 43.23, 1);
        stockList.addStock(temp);
        temp = new StockItem("Door", 3.42, 1);
        stockList.addStock(temp);
        temp = new StockItem("Juice", 2.12, 2);
        stockList.addStock(temp);
        temp = new StockItem("Towel", 1.12, 1);
        stockList.addStock(temp);

        System.out.println(stockList);
        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }
        Basket myBasket = new Basket("MyBasket");

        sellItem(myBasket, "Car", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "Car", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "Car", 1);
        System.out.println(myBasket);

        if(sellItem(myBasket, "Car", 1) != 1){
            System.out.println("there are no more cars in stock!");
        }
        sellItem(myBasket, "Peppers", 6);
        sellItem(myBasket, "Juice", 6);
        //System.out.println(myBasket);
        System.out.println(stockList);
        Basket basket =  new Basket("customer");
        sellItem(basket, "Juice", 100);
        sellItem(basket, "Cake", 100);
        removeItem(basket, "Cake", 100);

        removeItem(myBasket, "Car", 1);
        removeItem(myBasket, "Car", 9);
        removeItem(myBasket, "Car", 1);
        System.out.println("cars removed: " + removeItem(myBasket, "Car", 1));
        System.out.println(myBasket);
        System.out.println("Stocklist before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);
        //temp = new StockItem("Pen", 1.12);
        //stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("Car").adjustStock(2000);
        stockList.get("Car").adjustStock(-1000);
        System.out.println(stockList);
        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
        checkOut(myBasket);
        System.out.println(myBasket);

    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We dont sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0){
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We dont sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity){
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
