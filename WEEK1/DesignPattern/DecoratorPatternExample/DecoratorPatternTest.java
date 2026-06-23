package WEEK1.DesignPattern.DecoratorPatternExample;

public class DecoratorPatternTest {

    public static void main(String[] args) {

        String message = "Your order has been placed successfully.";

        System.out.println("Only Email Notification:");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send(message);

        System.out.println();

        System.out.println("Email and SMS Notification:");
        Notifier emailAndSMSNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        emailAndSMSNotifier.send(message);

        System.out.println();

        System.out.println("Email, SMS and Slack Notification:");
        Notifier allNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()
                        )
                );

        allNotifier.send(message);
    }
}