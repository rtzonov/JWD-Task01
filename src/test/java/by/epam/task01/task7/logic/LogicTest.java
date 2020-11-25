package by.epam.task01.task7.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void calculatingLength() {
        double []expected = {2, 3};
        double []arr = {3, 4};
        double [] actual = Logic.calculatingLength(expected, arr);
        assertArrayEquals(expected, actual);
    }
}