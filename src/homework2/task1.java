package homework2;

public class task1 { //нахождение числа в массиве
    public static void main(String[] args) {
        int num = 1;
        int[] arrayNum = {5, 1, 9, 1, -1};
        boolean result = false;
        for (int j : arrayNum) {
            if (num == j) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
