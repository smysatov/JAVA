package Homework_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        // Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1, 5, 3, 5, 6, 9, 11));
        System.out.println(integers);
        removeEven(integers);
        System.out.println(integers);
    }

    private static void removeEven(List<Integer> source) {
        for (int i = source.size() - 1; i >= 0; i--) {
            int temp = source.get(i);
            int temp2 = temp % 2;
            if (temp2 == 1) {
                source.remove(i);
            }
        }
    }
}