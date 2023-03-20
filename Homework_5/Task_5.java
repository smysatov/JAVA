package Homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_5 {
    public static void main(String[] args) {

        collectStats("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");
    }

    static void collectStats(String text) {
        String[] spl = text.split(" ");
        System.out.println(Arrays.toString(spl));
        Map<Integer, List<String>> stats = new HashMap<>();

        for (int i = 0; i < spl.length; i++) {
            int len = spl[i].length();

            stats.computeIfAbsent(len, k -> new ArrayList<>()).add(spl[i]);
        }
        for (Integer key : stats.keySet()) {
            //System.out.println(key + " = " + stats.get(key));
            
            System.out.println(stats.get(key));
        }
    }
}
