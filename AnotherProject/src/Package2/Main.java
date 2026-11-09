package Package2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        Student student = new Student(name, age);
        student.getInfo();

    }
}
