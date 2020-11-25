package by.epam.task01.task5.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void calculatingPerfectNumber() {
        boolean expected = true;
        boolean actual = Logic.calculatingPerfectNumber(6);
        assertEquals(expected, actual);

    }
}