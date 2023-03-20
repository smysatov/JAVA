package Homework_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    /**
     * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
     *
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст");
     //   String scan = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] strngs = scan.nextLine().split(" ");
        System.out.println("Текст: " + Arrays.toString(strngs));
        Arrays.sort(strngs, Comparator.comparing(String::length));
        System.out.println("После сортировки: " + Arrays.toString(strngs));
        scan.close();
        // static void collectStats(String text) {
        // Map<Integer, List<String>> stats = new HashMap<>();
        // }
    }
}
