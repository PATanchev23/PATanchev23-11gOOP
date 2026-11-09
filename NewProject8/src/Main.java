import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeofarr = scanner.nextInt();

        int[] number1 = new int[sizeofarr];

        for (int i = 0; i < number1.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            number1[i] = scanner.nextInt();
        }

        Calc calc = new Calc();

            int result = calc.sum(number1);
            System.out.println(result);
    }
}