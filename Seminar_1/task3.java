package Seminar_1;

/* Напишите метод, который находит самую длинную строку общего префикса среди
 массива строк. Если общего префикса нет, вернуть пустую строку ""*/

public class task3 {
    public static void main(String[] arg) {
        String[] array = { "abc", "abchsbd", "abc", "abcam" };
        String commonPrefix = findCommonPrefix(array);
        System.out.println(commonPrefix);
    }

    static String findCommonPrefix(String[] array) {
        String first = array[0];
        for (int i = 1; i < array.length; i++) {
            if (first.length() > array[i].length()) {
                first = array[i];
            }
        }
        
        String result = "";
        first: for (int index = 0; index < first.length(); index++) {
            char firstIndexChar = first.charAt(index);
            for (int i = 1; i < array.length; i++) {
                char secondStringChar = array[i].charAt(index);
        
                if (firstIndexChar != secondStringChar) {
                    break first;
                }
            }
            result += firstIndexChar;
        }
        
        return result;
    }
}