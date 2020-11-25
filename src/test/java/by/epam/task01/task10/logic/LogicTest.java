package by.epam.task01.task10.logic;

import org.junit.jupiter.api.Test;
import sun.rmi.runtime.Log;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void calculatingTan() {
        double[] expected = {2.185039863261519, 0.1425465430742778, -1.1578212823495777, 3.380515006246586, 0.29100619138474915, -0.8714479827243187, 6.799711455220379};
        double[] actual = Logic.calculatingTan(-2, -8, -1);
        assertArrayEquals(expected, actual);
    }
}