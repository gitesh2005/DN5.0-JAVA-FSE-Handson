package WEEK1.DesignPattern.AdapterPatternExample;

public class AdapterPatternTest {

    public static void main(String[] args) {

        Adaptee.PaymentProcessor paypalPayment =
                new Adaptee.PayPalAdapter(new Adaptee.PayPalGateway());

        paypalPayment.processPayment(2500);


        Adaptee.PaymentProcessor stripePayment =
                new Adaptee.StripeAdapter(new Adaptee.StripeGateway());

        stripePayment.processPayment(4200);


        Adaptee.PaymentProcessor razorpayPayment =
                new Adaptee.RazorpayAdapter(new Adaptee.RazorpayGateway());

        razorpayPayment.processPayment(1500);
    }
}