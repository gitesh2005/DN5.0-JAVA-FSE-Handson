package WEEK1.DesignPattern.StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy {

    private String emailId;

    public PayPalPayment(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " done using PayPal account: " + emailId);
    }
}