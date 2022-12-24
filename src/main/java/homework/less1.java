package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class less1 {
    public static void main(String[] args) {
        //System.out.println(ex1());
        //ex2(5);
        //System.out.println(ex3(-5));
        //ex4("ex4",5);
        //System.out.println(ex5());
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10(5,8);
        ex11();
    }

    private static void ex11() {
        int[] arr=new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("max = " + arr[arr.length-1]);
        System.out.println("min = " + arr[0]);
    }

    private static void ex10(int len, int initialValue) {
        int[] arr=new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex9() {
        int[] arr[] = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
                if (j == i | j == arr.length - i - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void ex8() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex7() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex6() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static boolean ex5() {
        System.out.print("Введите год: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        return (year % 4 == 0 & year % 100 != 0 | year % 400 == 0);
    }

    private static void ex4(String text, int num) {
        for (int j = 0; j < num; j++) {
            System.out.println(text);
        }
    }

    private static boolean ex3(int num) {
        return (num < 0);
    }

    private static void ex2(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }


    private static boolean ex1() {
        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        return (sum <= 20 & sum >= 10);
    }
}
