package Cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How long is the movie: ");
        String movieProgram = input.nextLine();
        int number = Integer.parseInt(movieProgram);

        int hours = number / 60;
        int minutes = number % 60;
        if(number <= 0)
        {
            System.out.println("Invalid input");
        }
        else{
            System.out.println(hours + " hours " + minutes + " minutes");
        }


    }
}