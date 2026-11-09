package Exercise5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        double S = Math.PI * r * r;
        double P = 2 * Math.PI * r;

        System.out.println(S);
        System.out.println(P);
    }
}
