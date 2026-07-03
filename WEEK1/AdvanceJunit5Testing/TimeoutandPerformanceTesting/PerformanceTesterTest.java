package WEEK1.AdvanceJunit5Testing.TimeoutandPerformanceTesting;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskTimeout() {
        PerformanceTester performanceTester = new PerformanceTester();

        assertTimeout(Duration.ofSeconds(1), () -> {
            performanceTester.performTask();
        });
    }
}