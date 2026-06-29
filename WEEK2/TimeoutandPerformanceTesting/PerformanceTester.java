package WEEK2.TimeoutandPerformanceTesting;

public class PerformanceTester {

    public void performTask() {
        for (int i = 0; i < 1000000; i++) {
            Math.sqrt(i);
        }
    }
}