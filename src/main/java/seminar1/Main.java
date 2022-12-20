package seminar1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        ex3();
    }

    private static void ex3() {
        Random random=new Random();
        /**Текст задачи:
         Дан массив nums = [3,2,2,3] и число val = 3.
         Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
         Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.*/
        int[] arr = new int[10];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]= random.nextInt(5);
        }
        System.out.println(Arrays.toString(arr));
        int val = 3;
        int left = 0;
        int b;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[right] == val) {
                right--;
            } else if (arr[left] == val) {
                arr[left] = arr[right];
                arr[right]=val;
                left++;
            } else if (arr[left] != val) {
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex2() {
//        Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        //это мое решение
        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else if (arr[i] == 0 & arr[arr.length - 1] == 1) {
                count = 0;
            }
        }
        System.out.print(count);

        //не мое
        /**int counter = 0;
         int result = 0;
         int[] binaryArray = new int[]{1,0,1,1,1,0,0,1,1,1,1,0,1};
         for(int i: binaryArray) {
         if (i == 1) {
         counter += 1;
         } else {
         result = Math.max(result, counter);
         counter = 0;
         }
         }
         System.out.println(Math.max(result, counter));*/
    }


// запрос имени и вывод с приветом
/**    private static void ex1() {
 System.out.print("Введите Ваше имя: ");
 Scanner scanner = new Scanner(System.in);
 String name = scanner.nextLine();
 // System.out.println("Привет, " + name);
 System.out.printf("Привет, %s%n", name);
 }*/
}





