package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class less2 {
    public static void main(String[] args) {
//        System.out.println(palindrome("dfgfd"));
        System.out.println(buildString("TEST", 100));
        printIntoFile("C:\\Users\\oks\\IdeaProjects\\java\\src\\main\\java\\homework\\TEST.txt");
    }

    /**
     * 1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
     */
    private static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
     */
    private static String buildString(String str, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    /**
     * и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
     */
    private static void printIntoFile(String path) {

        try (PrintWriter pw = new PrintWriter(path)) {
            pw.print(buildString("TEST", 100));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
