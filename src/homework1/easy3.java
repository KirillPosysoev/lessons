package homework1;

import java.util.Scanner;

public class easy3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите текущее время (час)");
        int time = console.nextInt();
        String dayPart;

        if (time < 4 || time == 24)
            dayPart = "Ночь";
        else if (time < 12)
            dayPart = "Утро";
        else if (time < 17)
            dayPart = "День";
        else if (time < 24)
            dayPart = "Вечер";
        else
            dayPart = "В сутках 24 часа";

        System.out.println(dayPart);
    }
}

