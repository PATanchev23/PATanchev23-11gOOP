import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(Prime.isPrime(n))
        {
            System.out.println("Prime Number");
        }
        else
            {
            System.out.println("Not Prime Number");
            }
    }
}