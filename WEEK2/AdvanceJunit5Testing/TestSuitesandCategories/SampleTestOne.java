package WEEK2.AdvanceJunit5Testing.TestSuitesandCategories;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("basic")
public class SampleTestOne {

    @Test
    public void testOne() {
        assertTrue(10 > 5);
    }
}