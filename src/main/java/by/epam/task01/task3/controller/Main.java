package by.epam.task01.task3.controller;


import by.epam.task01.task3.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;

public class Main {
    public static void main(String[] args) {
        Output.outputMessage("Enter area of square: ");
        double area = Input.getIntValue();
        Output.outputMessageLine("Area of the inscribed square = " + Logic.findingAnArea(area));
        Output.outputMessageLine("a square inscribed in a circle is " + Logic.calculateDifference(area, Logic.findingAnArea(area)) + " times smaller than the one described");

    }
}
