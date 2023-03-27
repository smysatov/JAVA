package Homework_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person prs1 = new Person("Sergey", "Mysatov", 42, "male", 186, 112);
        Person prs2 = new Person("Liza", "Mysatova", 1, "female", 86, 13);
        Person prs3 = new Person("Ananstasiia", "Mysatova", 15, "female", 156, 47);

        ArrayList<Person> array = new ArrayList<>();
        array.add(prs1);
        array.add(prs2);
        array.add(prs3);

        System.out.println();
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        System.out.println();
        
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getAge() > 20) {
                System.out.println("Возраст больше 20 лет: " + array.get(i).getName());
            }
        }
    }
}
