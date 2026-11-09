package AirCondition;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the air condition: ");
        String text = input.nextLine();

        double number = Double.parseDouble(text);

        if(number < 0)
        {
            System.out.println("Invalid input");
        }
        else if(number >= 0 && number <= 25)
        {
            System.out.println("Air condition is good");
        }
        else if(number >= 25 && number <= 50)
        {
            System.out.println("Air condition is moderate");
        }
        else {
            System.out.println("High polution");
        }

    }
}
