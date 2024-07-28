package homework2;

public class task2 { //нахождение индекса минимального числа в массиве
    public static void main(String[] args) {
        int[] arrayNum = {5, -1, -9, 1, -1};
        int minNum = arrayNum[0];
        int indexMinNum = 0;
        for (int i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i] < minNum) {
                minNum = arrayNum[i];
                indexMinNum = i;
            }
        }
        System.out.println(indexMinNum);
    }
}
