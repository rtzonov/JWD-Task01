package by.epam.task01.task4.controller;


import by.epam.task01.task4.logic.Logic;
import by.epam.task01.util.Input;
import by.epam.task01.view.Output;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[4];
        Output.outputMessage("Enter 4 numbers: ");
        for(int i = 0; i<4; i++) arr[i] = Input.getIntValue();
        Output.outputMessageLine("Are there at least 2 numbers among the numbers: " + Logic.compare(arr));
    }
}
