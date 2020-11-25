package by.epam.task01.task8.controller;

import by.epam.task01.task8.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;


public class Main {
    public static void main(String[] args) {
        Output.outputMessage("Enter x for function: ");
        double x = Input.getDoubleValue();
        Output.outputMessageLine("F(x) = " + Logic.calculatingFunction(x));

    }
}