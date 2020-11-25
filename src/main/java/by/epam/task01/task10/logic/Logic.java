package by.epam.task01.task10.logic;

public class Logic {
    public static double[] calculatingTan(double a, double b, double h){

        int len = Math.abs((int)((b-a)/h));
        double[] arr = new double[len + 1];

        for (int i = 0;i <= len; a += h, i++) {
            arr[i] = Math.tan(a);
        }
        return arr;
    }
}
