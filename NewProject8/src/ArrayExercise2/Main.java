package ArrayExercise2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Misho" , "Ivan"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = {5, 6, 7};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        int[] numbers2 = {5, 6, 7};
        for(int number : numbers2) {
            System.out.println(number);
        }

    }
}
