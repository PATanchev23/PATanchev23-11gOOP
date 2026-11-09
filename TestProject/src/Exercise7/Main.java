package Exercise7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age >= 18)
        {
            System.out.println("You are an adult");
        }
        else if(age > 0)
        {
            System.out.println("You are under 18");
        }
        else
        {
            System.out.println("Invalid age");
        }
    }
}
