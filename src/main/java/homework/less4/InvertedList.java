package homework.less4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class InvertedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(invert(ll));
        ;
    }

    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    private static LinkedList invert(LinkedList list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = (Integer) list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
        return list;
    }
}
