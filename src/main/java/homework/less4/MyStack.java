package homework.less4;

import java.util.Stack;

public class MyStack {
    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        System.out.println(push()); //добавить в конец
        System.out.println(peek()); //посмотреть последнее в стеке
        System.out.println(pop()); //посмотреть и извлечь последнее в стеке
        System.out.println(stack);
    }

    private static Stack push() {
        for (int i = 0; i < 10; i++) {
            stack.add(i);
        }
        return stack;
    }

    private static Integer peek() {
        Integer item = stack.peek();
        return item;
    }

    private static Integer pop() {
        Integer LastEl = stack.pop();
        return LastEl;
    }
}
