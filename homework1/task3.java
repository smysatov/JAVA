package homework1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string: ");
        String source = in.next();
        System.out.print("repeat: ");
        int repeat = in.nextInt();
        in.close();
        printString(source, repeat);
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int index = 0; index < repeat; index++) {
            System.out.println(source);
        }
    }
}