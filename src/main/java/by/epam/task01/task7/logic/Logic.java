package by.epam.task01.task7.logic;

public class Logic {
    public static double[] calculatingLength(double[] a, double[] b){
       double len1 = Math.hypot(a[0],a[1]);
       double len2 = Math.hypot(b[0],b[1]);
       return len1 < len2 ? a : b;
    }
}
