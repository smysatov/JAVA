package homework1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Array length: ");
        int len = in.nextInt();
        System.out.print("Value: ");
        int initalValue = in.nextInt();
        in.close();
        createArray(len, initalValue);
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initalValue;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        return array;
    }
}