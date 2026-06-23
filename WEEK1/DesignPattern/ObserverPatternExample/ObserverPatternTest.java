package WEEK1.DesignPattern.ObserverPatternExample;

public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("First stock price update:");
        stockMarket.setStockDetails("TCS", 3450.50);

        System.out.println();

        System.out.println("Second stock price update:");
        stockMarket.setStockDetails("Infosys", 1480.75);

        System.out.println();

        stockMarket.deregisterObserver(webApp);

        System.out.println("After removing Web App observer:");
        stockMarket.setStockDetails("Wipro", 520.25);
    }
}