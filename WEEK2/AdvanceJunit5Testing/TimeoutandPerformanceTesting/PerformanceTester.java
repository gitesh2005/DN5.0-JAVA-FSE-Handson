package WEEK2.AdvanceJunit5Testing.TimeoutandPerformanceTesting;

public class PerformanceTester {

    public void performTask() {
        for (int i = 0; i < 1000000; i++) {
            Math.sqrt(i);
        }
    }
}