package Repetition.Unittesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
private Auto auto = null;
    @BeforeEach
    void setUp() {
        auto = new Auto();
    }

    @Test
    void testGetTankinhalt() {
        assertEquals(0, auto.getTankinhalt());
    }

    @Test
    void testTanken() {
        auto.tanken(50);
        assertEquals(50, auto.getTankinhalt());

        auto.tanken(0.01);
        assertEquals(50, auto.getTankinhalt());
    }

    @Test
    void testFahren() {
        auto.fahren(0.01);
        assertEquals(0, auto.getTankinhalt());

        auto.tanken(50);
        auto.fahren(1000);
        assertEquals(0, auto.getTankinhalt());

        auto.fahren(0.01);
        assertEquals(0, auto.getTankinhalt());
    }
}