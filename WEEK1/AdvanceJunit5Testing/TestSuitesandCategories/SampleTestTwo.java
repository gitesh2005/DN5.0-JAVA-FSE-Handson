package WEEK1.AdvanceJunit5Testing.TestSuitesandCategories;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("basic")
public class SampleTestTwo {

    @Test
    void testTwo() {
        assertEquals(20, 10 + 10);
    }
}