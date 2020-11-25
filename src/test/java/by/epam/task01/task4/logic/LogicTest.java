package by.epam.task01.task4.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void compare() {
        boolean expected = true;
        boolean actual = Logic.compare(new int[]{2, 3, 4, 5});
        assertEquals(expected, actual);
    }
}