package by.epam.task01.task2.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void countingDays() {
        int expected = 29;
        int actual = Logic.countingDays(2,2000);
        assertEquals(expected, actual);
    }
}