package Homework_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_2 {
    /**
     * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
     * проснись
     *
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */
    public static void main(String[] args) {
        String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        collectStats(str);
    }

    private static void collectStats(String text) {
        Map<Integer, List<String>> stats = new HashMap<>();
        String[] str = text.split(" ");
        Arrays.sort(str, Comparator.comparing(String::length));
        System.out.println("После сортировки: " + Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            if (stats.containsKey(str[i])) {
                
            }
        }
    }
}