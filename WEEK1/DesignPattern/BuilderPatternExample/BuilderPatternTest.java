package WEEK1.DesignPattern.BuilderPatternExample;

public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i7")
                .setRAM("16 GB")
                .setStorage("1 TB SSD")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8 GB")
                .setStorage("512 GB SSD")
                .build();

        Computer basicComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 3")
                .setRAM("4 GB")
                .setStorage("256 GB SSD")
                        .build();

        gamingComputer.displayDetails();
        officeComputer.displayDetails();
        basicComputer.displayDetails();
    }
}