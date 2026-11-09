package Exercise10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int multiplied = 0;
        for(int i = 1; i <= 10; i++){
            multiplied = number * i;
            System.out.print(number + " x " + i + " = " + multiplied + " | ");
        }
    }
}
