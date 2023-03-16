package Homework_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    /**
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
     * num.
     * Если введено print~num, выводит строку из позиции num в связном списке.
     * Если введено exit, завершаем программу
     * 
     * Пример:
     * string~4
     * num~3
     * 
     * print~3
     * num
     * print~4
     * string
     * my_value~1
     * print~1
     * my_value
     */
    public static void main(String[] args) {
        System.out.println("Enter a 'string~number' or 'exit' to stop the program");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> DB = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            try {
                if (s.equals("exit")) {
                    break;
                }
                Integer.parseInt(s.split("~")[1]);

            } catch (Exception e) {
                System.out.println("Error");
            }
            String[] data = s.split("~");
            int num = Integer.parseInt(data[1]);
            int Size = num - DB.size();
            for (int i = 0; i <= Size; i++) {
                DB.add(null);
            }
            if (data[0].equals("print")) {
                System.out.println(DB.get(num));
            } else {
                DB.set(num, data[0]);
            }
        }
    }
}
