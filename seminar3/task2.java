package seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1, 5, 3, 5, 6, 9, 11));
        System.out.println(integers);
        removeDuplicates(integers);
        System.out.println(integers);
    }

    private static void removeDuplicates(List<Integer> source) {
        // нужно удалить все дупликаты
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while (i < source.size()) {
            Integer element = source.get(i);
            if (!duplicates.contains(element)) {
                duplicates.add(element);
            } else {
                source.remove(i--);
            }
            i++;
        }
    }
}
