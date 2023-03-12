package Homework_3;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        // Дан список ArrayList<String>. Удалить из него все строки, которые являются
        // числами Пример: ArrayList<String> list = new ArrayList<>(List.of("string",
        // "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]
        ArrayList<String> source = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(source);
        removeNumber(source);
        System.out.println(source);
    }

    public static void removeNumber(List<String> it) {
        for (int i = it.size() - 1; i >= 0; i--) {
            try {
                String str = it.get(i);
                Integer.parseInt(str);
                it.remove(i);

            } catch (NumberFormatException e) {

            }
        }
    }
}
