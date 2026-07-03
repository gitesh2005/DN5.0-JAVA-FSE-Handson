package WEEK1.Junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    public  void testAdd(){
        calculator calc = new calculator();
        int actualResult = calc.add(4,5);
        int expectedResult = 9;

        assertEquals(actualResult , expectedResult);
    }



    @Test
    public  void testSub(){
        calculator calcc = new calculator();

        int actualResult = calcc.substract(7,4);
        int expectedResult = 3;


        assertEquals(actualResult , expectedResult);
    }
}
