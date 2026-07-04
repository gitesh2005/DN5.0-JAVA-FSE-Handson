package WEEK1.Junit5_BasicTesting_Exercise.Assertions_JUnit.src.main.java;


public class AssertionsExample {

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public boolean isGreater(int a, int b) {
        return a > b;
    }

    public boolean isLess(int a, int b) {
        return a < b;
    }

    public Object getNullValue() {
        return null;
    }

    public Object getObject() {
        return new Object();
    }
}