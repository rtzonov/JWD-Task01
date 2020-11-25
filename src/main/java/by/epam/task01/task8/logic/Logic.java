package by.epam.task01.task8.logic;

public class Logic {
    public static double calculatingFunction(double x){
      return x >= 3 ? - Math.pow(x, 2) + (3 * x) + 9 : 1 / (Math.pow(x, 3) - 6);
    }
}
