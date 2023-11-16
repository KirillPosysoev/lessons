package lesson2;

public class task1 {
    public static void main(String[] args) {
        int target = 64;
        out:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j == target) {
                    System.out.println(i + " " + j);
                    break out;
                }

            }

        }
    }
}
