package WEEK1.DesignPattern.ObserverPatternExample;

public class WebApp implements Observer {

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Web App Notification: " + stockName + " price changed to Rs. " + stockPrice);
    }
}