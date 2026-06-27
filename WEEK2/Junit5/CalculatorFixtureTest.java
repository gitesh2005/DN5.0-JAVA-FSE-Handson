package WEEK2.Junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorFixtureTest {

        private calculator calculator;

        @BeforeEach
        public void setUp() {
            calculator = new calculator();
            System.out.println("Setup method called");
        }

        @AfterEach
        public void tearDown() {
            calculator = null;
            System.out.println("Teardown method called");
        }

        @Test
        public void testAddUsingAAA() {
            // Arrange
            int a = 2;
            int b = 3;

            // Act
            int result = calculator.add(a, b);

            // Assert
            assertEquals(5, result);
        }

        @Test
        public void testSubtractUsingAAA() {
            // Arrange
            int a = 5;
            int b = 2;

            // Act
            int result = calculator.substract(a, b);

            // Assert
            assertEquals(3, result);
        }
    }
