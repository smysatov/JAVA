package Homework_1;

public class task6 {

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
    // заменить 0 на 1, 1 на 0;
    public static void main(String[] args) {
        int array[] = { 1, 0, 0, 1, 1, 1, 0, 0, 0, 1 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i : array) {
            if (array[i] == 0)
                array[i] = 1;
            else
                array[i] = 0;
        }
        System.out.println();
        for (int j : array) {
            System.out.print(array[j] + " ");
        }
    }

}
