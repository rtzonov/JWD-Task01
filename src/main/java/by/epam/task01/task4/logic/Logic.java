package by.epam.task01.task4.logic;

public class Logic {

    public static boolean compare(int[] arr){
        int counter = 0;
        for(int i = 0;i < 4; i++){

            if(arr[i] % 2 == 0){
                counter++;
                if(counter == 2) return true;
            }
        }
        return false;
    }

}
