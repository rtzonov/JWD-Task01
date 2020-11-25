package by.epam.task01.task1.controller;

import by.epam.task01.task1.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;

public class Main {
    public static void main(String[] args) {
        Output.outputMessage("Enter number: ");
        int number = Input.getIntValue();
        Output.outputMessageLine("Last digit of squared "+ number + " is "  + Logic.square(number) );
    }
}
