package by.epam.task01.task9.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void calculationsWithRadius() {
        double [] expected = {18.84955592153876, 28.274333882308138};
        double [] actual = Logic.calculationsWithRadius(3);
        assertArrayEquals(expected, actual);
    }
}