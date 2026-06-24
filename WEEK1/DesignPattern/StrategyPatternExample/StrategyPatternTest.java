package WEEK1.DesignPattern.StrategyPatternExample;

public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876"));
        paymentContext.makePayment(2500);

        paymentContext.setPaymentStrategy(new PayPalPayment("giteshsorout@gmail.com"));
        paymentContext.makePayment(4200);
    }
}
