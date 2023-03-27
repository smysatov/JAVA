package Homework_6;

import java.util.Objects;

public class Person {
    /**
     * Создать класс Person.
     * У класса должны быть поля:
     * 1. Имя (String)
     * 2. Фамилия (String)
     * 3. Возраст (продумать тип)
     * 4. Пол
     * 5*. Придумать свои собственные поля
     * 
     * Для этого класса
     * 1. Реализовать методы toString, equals и hashCode.
     * 2*. Придумать собственные методы и реализовать их
     * 
     * В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и
     * вывести их на экран.
     */
    protected String name;
    protected String surname;
    protected int age;
    protected String gender;
    protected int height;
    protected int weight;

    public Person(String name, String surname, int age, String gender, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public int hashCode() {
        return Objects.hash(name, surname, age, gender, height, weight);
    }

    public String toString() {
        return String.format("%s %s: возраст-%d, пол-%s, рост-%d, вес-%d", name, surname, age, gender, height, weight);
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson) {
            return false;
        }

        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) && age == anotherPerson.age;
    }
}
