package Package1;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("First number: ");
            int a = Integer.parseInt(scanner.nextLine()); // Парсване на методи

            System.out.print("Second number: ");
            int b = Integer.parseInt(scanner.nextLine()); // Парсване на методи

            int sum = a + b;

            System.out.println("Sum:" + sum);
        }
    }
