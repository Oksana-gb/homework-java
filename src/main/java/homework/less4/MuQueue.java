package homework.less4;

import java.util.LinkedList;
import java.util.Queue;

public class MuQueue {
    private static Queue<Integer> queue = new LinkedList<Integer>();

    public static void main(String[] args) {
        System.out.println(add()); //добавить в конец
        System.out.println(top()); //посмотреть первое в очереди
        System.out.println(remove()); //извлечь и вернуть первое в очереди
        System.out.println(queue);
    }

    private static Queue<Integer> add() {
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        return queue;
    }

    private static Integer top() {
        Integer item = queue.peek();
        return item;
    }

    private static Integer remove() {
        Integer FirstEl = queue.remove();
        return FirstEl;
    }
}
