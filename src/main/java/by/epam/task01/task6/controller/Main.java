package by.epam.task01.task6.controller;


import by.epam.task01.task6.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Output.outputMessage("Enter the number of seconds: ");
    int second = Input.getIntValue();
    Output.outputMessageLine("Hours, minutes, seconds: " + Arrays.toString(Logic.calculatingTime(second)) );
    }
}
