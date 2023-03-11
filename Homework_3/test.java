package Homework_3;

public class test {
    public static void main(String[] args) {

        String string = "10";

        try {
            int intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
    }
}
