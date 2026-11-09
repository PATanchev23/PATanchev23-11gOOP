import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();


        System.out.println("Enter Age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name + " , Age: " + age);
    }
}
