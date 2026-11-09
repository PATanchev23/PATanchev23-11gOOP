package Exercise9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        if(score >= 90 && score <= 100) {
            System.out.println("Excellent");

        }
        else if(score >= 75 && score <= 89)
        {
            System.out.println("Very Good");
        }
        else if(score >= 60 && score <= 74) {
            System.out.println("Good");
        }
        else if(score >= 50 && score <= 59) {
            System.out.println("Average");
        }
        else if(score >= 0 && score <= 49) {
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid score");
        }

    }

}
