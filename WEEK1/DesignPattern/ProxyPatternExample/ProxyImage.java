package WEEK1.DesignPattern.ProxyPatternExample;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String imageName;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(imageName);
        } else {
            System.out.println("Image loaded from cache: " + imageName);
        }

        realImage.display();
    }
}