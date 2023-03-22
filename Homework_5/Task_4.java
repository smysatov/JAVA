package Homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner consoleInput = new Scanner(System.in);
        String[] words = consoleInput.nextLine().split(" ");
        Map<Integer, ArrayList<String>> stats = new HashMap<>();
        consoleInput.close();

        fillHashMap(words, stats);
        printResult(stats);
    }

    static void printResult(Map<Integer, ArrayList<String>> myMap) {
        for (Map.Entry<Integer, ArrayList<String>> entry : myMap.entrySet()) {
            Integer key = entry.getKey();
            ArrayList value = entry.getValue();
            System.out.print(key + ": ");
            for (Object word : value) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }

    static void fillHashMap(String[] array, Map<Integer, ArrayList<String>> myHashMap) {
        for (String item : array) {
            myHashMap.computeIfAbsent(item.length(), k -> new ArrayList<>()).add(item);
        }
    }
}
