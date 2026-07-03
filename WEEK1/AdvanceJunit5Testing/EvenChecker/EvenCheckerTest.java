package WEEK1.AdvanceJunit5Testing.EvenChecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {

    EvenChecker ec = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    void  testEvenNumber(int number){
        assertTrue(ec.isEven(number));
    }


    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9})
    void testEvenNumber1(int number){
        assertFalse(ec.isEven(number));
    }

}
