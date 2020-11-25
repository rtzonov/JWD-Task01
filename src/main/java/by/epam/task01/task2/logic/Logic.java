package by.epam.task01.task2.logic;

public class Logic {

    public static int countingDays(int month , int year){
        int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year % 4 == 0 || year % 400 == 0){
            months[1] = 29;
        }
        return months[month - 1];
    }

}
