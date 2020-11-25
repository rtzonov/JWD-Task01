package by.epam.task01.task6.logic;

public class Logic {

    final static int CF_TO_CONVERT_TO_HOUR = 3600;
    final static int CF_TO_CONVERT_TO_MINUTE = 60;

    public static int[] calculatingTime(int seconds){
        int hour = seconds / CF_TO_CONVERT_TO_HOUR;
        int minute = (seconds - (hour * CF_TO_CONVERT_TO_HOUR))/ CF_TO_CONVERT_TO_MINUTE;
        int second = seconds - ((hour * CF_TO_CONVERT_TO_HOUR) + (minute * CF_TO_CONVERT_TO_MINUTE));

        return new int[]{hour, minute, second};
    }
}
