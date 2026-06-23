package WEEK1.DesignPattern.ProxyPatternExample;

public class ProxyPatternTest {

    public static void main(String[] args) {

        Image image = new ProxyImage("nature_photo.jpg");

        System.out.println("First time image display:");
        image.display();

        System.out.println();

        System.out.println("Second time image display:");
        image.display();
    }
}