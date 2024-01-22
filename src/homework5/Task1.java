package homework5;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList <Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 201; i++) { //вероятно тут нужна реализация со стримом
            if (i%2!=0)
                numbers.add(i);
                    }
        for (Integer num: numbers) {
            sum =+num;
        }
        System.out.println(sum);
    }
}
