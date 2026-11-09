package TechExhibition;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String age = input.nextLine();
        String ticket = input.nextLine();

        int ageint = Integer.parseInt(age);
        boolean ticketboolean = Boolean.parseBoolean(ticket);

        if(ticketboolean && ageint >= 16){
            System.out.println("Access granted");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
