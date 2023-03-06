package homework1;

import java.util.Scanner;

public class task1 {

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number a: ");
        int a = in.nextInt();
        System.out.print("Input number b: ");
        int b = in.nextInt();
        in.close();
        System.out.println(isSumBetween10And20(a, b));
    }

    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if ((a + b) > 10 && (a + b) < 20) {
            return true;
        }
        return false;
    }
}