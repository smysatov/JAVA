package Homework_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    /**
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
     * num.
     * Если введено print~num, выводит строку из позиции num в связном списке.
     * Если введено exit, завершаем программу
     * Пример:
     * string~4
     * num~3
     * print~3
     * 
     * num
     * print~4
     * string
     * my_value~1
     * print~1
     * my_value
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            String[] split = s.split("~");
            System.out.println(Arrays.toString(split));
            Integer.parseInt(split[1]);
        }
        List<Integer> list = new ArrayList<>();
        while (list.size() <= 5) {
            list.add(null);
        }
        list.set(5, 5);
        System.out.println(list);

    }
}
