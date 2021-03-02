package academy.learnprogramming;

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
    }
}
