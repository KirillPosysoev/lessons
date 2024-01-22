package homework5;

import java.util.ArrayList;
import java.util.HashSet;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        addList(list);
        System.out.println(list.toString());
        System.out.println((unique(list)).toString());
    }
    public static void addList(ArrayList<Object> list) {
        list.add(1);
        list.add(1);
        list.add(11);
        list.add(111);
        list.add("ff");
        list.add("fff");
        list.add("ff");
    }

    public static HashSet<Object> unique(ArrayList<Object> list) {
        HashSet<Object> result = new HashSet<>();
        for (Object name : list) {
            result.add(name);
        }
        return result;
    }
}
