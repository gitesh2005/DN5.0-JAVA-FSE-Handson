package WEEK1.DesignPattern.SingletonPatternExample;

public class SingletonTest {

    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();    // this is not an object this is a reference variable..

        Logger logger2 = Logger.getInstance();


        logger1.log("Application Started");
        logger2.log("Application is running");

        if(logger1 == logger2){
            System.out.println("Only one Logger file is used and assign");
        }
        else{
            System.out.println("Different logger instance is created");
        }
        
    }
    
}
