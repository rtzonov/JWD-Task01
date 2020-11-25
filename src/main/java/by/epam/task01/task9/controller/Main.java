package by.epam.task01.task9.controller;

import by.epam.task01.task9.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Output.outputMessage("Enter r for calculation: ");
        double r = Input.getDoubleValue();
        Output.outputMessageLine("Circumference and Area: " + Arrays.toString(Logic.calculationsWithRadius(r)));
    }
}