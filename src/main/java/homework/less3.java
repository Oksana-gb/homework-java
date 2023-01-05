package homework;

import java.util.*;

public class less3 {

    public static void main(String[] args) {
        //RemoveEvenNumbers();
        task2();
    }

    private static Random random = new Random();


    /**
     * 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
     */
    private static void RemoveEvenNumbers() {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
        numbers.removeIf(i -> i % 2 == 0);
        ;
        System.out.println(numbers);
    }


    /**
     * 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
     */
    private static void task2() {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
        double aa = numbers.stream().mapToInt(a -> a).average().orElse(0);
        System.out.printf("max: %s\t, min: %s\t, aa: %s\t", Collections.max(numbers), Collections.min(numbers), aa);
    }
}
