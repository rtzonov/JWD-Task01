package by.epam.task01.task10.controller;

import by.epam.task01.task10.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Output.outputMessage("Enter the coordinates of the AB segment and the step: ");
        double x = Input.getDoubleValue();
        double y = Input.getDoubleValue();
        double step = Input.getDoubleValue();
        Output.outputMessageLine("Circumference and Area: " + Arrays.toString(Logic.calculatingTan(x, y, step)));
    }
}