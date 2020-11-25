package by.epam.task01.task6.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void calculatingTime() {
        int[] expected = {14, 7, 13};
        int[] actual = Logic.calculatingTime(50833);
        assertArrayEquals(expected, actual);

    }
}