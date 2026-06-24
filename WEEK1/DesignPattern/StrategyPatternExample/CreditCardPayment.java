package WEEK1.DesignPattern.StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " done using Credit Card: " + cardNumber);
    }
}