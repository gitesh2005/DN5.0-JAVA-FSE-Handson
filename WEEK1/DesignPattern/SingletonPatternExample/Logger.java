package WEEK1.DesignPattern.SingletonPatternExample;

import java.util.*;
public class Logger {

    private static Logger SingleLogger;

    private Logger(){

        System.out.println("Logger object created successfully");

        
    }

    public static Logger getInstance(){
        if(SingleLogger == null){
            SingleLogger= new Logger();
        }

            return SingleLogger;
    }

public void log(String message){
    System.out.println("Log : " + message);
}


    
}
