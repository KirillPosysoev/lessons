package homework2;

public class task4 { //рассчет элемента ряда Фибоначчи
    public static void main(String[] args) {
        int elementNum = 3;
        int previousElement = 1;
        int currentElement = 1;
        for (int i = 3; i <= elementNum; i++) {
            currentElement += previousElement;
            previousElement = currentElement - previousElement;
        }
        System.out.println(currentElement);

    }
}
