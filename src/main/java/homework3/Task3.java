package homework3;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {44, 444, 5, -222, 6, 3333};
        int num = 5;
        System.out.println(linearSearch(array, num));
    }

    static int linearSearch(int[] array, int num) {  //линейный поиск
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}
