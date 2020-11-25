package by.epam.task01.task5.controller;


import by.epam.task01.task5.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;

public class Main {
    public static void main(String[] args) {
        Output.outputMessage("Enter number: ");
        int number = Input.getIntValue();
        Output.outputMessageLine("this number is perfect - " + Logic.calculatingPerfectNumber(number));
    }
}
