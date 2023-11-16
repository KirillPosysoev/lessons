package lesson2;

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {

        int[][] array = new int [5][5];




        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);

            }

        }

        System.out.println(Arrays.deepToString(array));

        int minIndexI = 0;
        int minIndexJ = 0;
        int minElem = array[minIndexI][minIndexJ];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               int currentElem = array[i][j];

               if(currentElem<minElem) {
                   minElem=currentElem;
                   minIndexI = i;
                   minIndexJ = j;
               }

            }
        }
        System.out.println(minElem);
        System.out.println(minIndexI);
        System.out.println(minIndexJ);


    }

}
