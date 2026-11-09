package Safe;
import java.util.Scanner;

public class Main {

   static boolean checkPin(int enteredPin, int correctPin)
    {
        return enteredPin == correctPin;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctP = 0000;
        int attempts = 0;
        boolean unlocked = false;

        while (attempts < 3) {
            System.out.print("Enter pin: ");
            String pin = input.nextLine();
            int pinInt = Integer.parseInt(pin);
            if (checkPin(pinInt, correctP))
            {
                System.out.println("Unlocked");
                unlocked = true;
                break;
            }

            attempts++;
        }
        if(!unlocked)
        {
            System.out.println("Locked");
        }
        input.close();
    }

}
