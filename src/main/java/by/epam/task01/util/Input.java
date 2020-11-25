package by.epam.task01.util;
import java.util.Scanner;

public class Input {
    static Scanner in = new Scanner(System.in);

    public static int getIntValue()
    {
        return in.nextInt();
    }
    public static double getDoubleValue(){ return in.nextDouble(); }
}
