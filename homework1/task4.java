package homework1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Year: ");
        int year = in.nextInt();
        in.close();
        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
}
}