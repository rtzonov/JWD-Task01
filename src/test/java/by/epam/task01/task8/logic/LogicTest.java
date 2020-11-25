package by.epam.task01.task8.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void calculatingFunction() {
        double expected = 5;
        double actual = Logic.calculatingFunction(4);
        assertEquals(expected, actual);
    }
}