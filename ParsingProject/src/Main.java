import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        String input = scanner.nextLine();
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        int age = Integer.parseInt(input);
        System.out.println("Your age is: " + age);
    }
}