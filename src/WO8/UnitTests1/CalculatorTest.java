package WO8.UnitTests1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = null;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(10, calculator.add(8, 2));
    }

    @Test
    void subtract() {
        assertEquals(10, calculator.subtract(11, 1));
    }
}