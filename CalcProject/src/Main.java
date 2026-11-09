import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextInt();
        input.nextLine();
        System.out.println("Enter second number: ");
        double number2 = input.nextInt();

        Calculator calculator = new Calculator(number1,number2);
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());

    }
}