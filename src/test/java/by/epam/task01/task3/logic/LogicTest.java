package by.epam.task01.task3.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void testFindingAnArea() {
        double expected = 2.5;
        double actual = Logic.findingAnArea(5);
        assertEquals(expected,actual);
    }

    @Test
    void calculateDifference() {
        int expected = 2;
        double actual = Logic.calculateDifference(10 , 5);
        assertEquals(expected, actual);
    }
}