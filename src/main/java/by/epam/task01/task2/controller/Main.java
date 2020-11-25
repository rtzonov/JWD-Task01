package by.epam.task01.task2.controller;


import by.epam.task01.task2.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;

public class Main {
    public static void main(String[] args) {
        Output.outputMessage("Enter month, year: ");
        int month = Input.getIntValue();
        int year = Input.getIntValue();
        Output.outputMessageLine("Number of days per month " + month + " for year " + year + " is equal to " + Logic.countingDays(month,year));
    }
}
