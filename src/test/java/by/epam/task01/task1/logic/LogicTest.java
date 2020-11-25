package by.epam.task01.task1.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void square() {
        int expected = 4;
        int actual = Logic.square(12);
        assertEquals(expected,actual);
    }
}