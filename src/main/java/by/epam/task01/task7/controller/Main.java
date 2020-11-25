package by.epam.task01.task7.controller;

import by.epam.task01.task7.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Output.outputMessage("Enter the coordinates of the first point and second point: ");
        double[] arr1 = {Input.getDoubleValue(), Input.getDoubleValue()};
        double[] arr2 = {Input.getDoubleValue(), Input.getDoubleValue()};
        Output.outputMessageLine("Nearest point to the origin = " + Arrays.toString(Logic.calculatingLength(arr1, arr2)));
    }
}
