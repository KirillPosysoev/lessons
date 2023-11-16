package lesson2;

public class task4 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] a : array) {
            for (int currentValue : a) {
                System.out.print(currentValue + " ");
            }
            System.out.println();
        }


    }
}
