package WEEK1.DesignPattern.ObserverPatternExample;

public class MobileApp implements Observer {

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Mobile App Notification: " + stockName + " price changed to Rs. " + stockPrice);
    }
}