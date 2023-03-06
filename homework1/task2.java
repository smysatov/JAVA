package homework1;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int x = in.nextInt();
        in.close();
        System.out.println(isPositive(x));
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) {
            return true;
        }
        return false;
    }
}