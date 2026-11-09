package Exercise8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int large = 0;

        if(number1 > number2 && number1 > number3)
        {
            large = number1;
        }
        else if(number2 > number1 && number2 > number3)
            {
            large = number2;
            }
        else {
            large = number3;
        }

        System.out.println("Largest number is " + large);
    }
}
