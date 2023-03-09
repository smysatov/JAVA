package Homework2;

import java.io.FileWriter;
import java.io.IOException;

//Создать файл с названием file.txt. Если файл уже есть, то создавать не надо
// Записать в него Слово "TEXT" 100 раз
public class task2 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file.txt");
            String array[] = new String[100];
            for (int i = 0; i < array.length; i++) {
                array[i] = "TEXT";
            }
            for (String line : array) {
                writer.write(line);
                writer.write(System.getProperty("line.separator"));
            }

            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
