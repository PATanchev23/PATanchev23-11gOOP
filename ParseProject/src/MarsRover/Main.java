package MarsRover;
import java.util.Scanner;

public class Main {
    public static double calculateFuel(double distance, double consumption)
    {
        double fuelRequired = (distance * consumption) / 100;
        return fuelRequired;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance: ");
        String distance = input.nextLine();
        System.out.print("Enter the fuel efficiency: ");
        String consumption = input.nextLine();

        double distanceDouble = Double.parseDouble(distance);
        double consumptionDouble = Double.parseDouble(consumption);

        double fuelRequired = calculateFuel(distanceDouble, consumptionDouble);

        double fuelReserve = fuelRequired * 1.10;

        System.out.println("Fuel with reserve: " + fuelReserve);

    }
}
