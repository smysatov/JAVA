package Homework_2;
//Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет

//строку длины N, которая состоит из чередующихся символов c1 и c2,
//начиная с c1. (6, 'a', 'b') -> "ababab"

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input even number: ");
		int n = in.nextInt();
        in.close();
        char a = 'a';
		char b = 'b';
		System.out.println(buildstring(n, a, b));
    }

    static String buildstring(int n, char c1, char c2) {
        for (int i = 0; i < n; i++) {
            System.out.print(c1);
            System.out.print(c2);
        }
        System.out.println();
        throw new UnsupportedOperationException();
    }

}
