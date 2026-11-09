import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a nuber ");
        int number = input.nextInt();

        Numbers numbers = new Numbers(number);
        numbers.checkNumber();
    }
}
