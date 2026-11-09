package Exercise3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius = input.nextDouble();
        double Fahrenheit = (celcius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is " + Fahrenheit);
    }
}
