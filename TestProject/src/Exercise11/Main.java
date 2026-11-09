package Exercise11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = 0;

        for(int i = 1; i <= N; i++){
            if(i >= 0)
            {
                sum += i;
                System.out.println(sum);
            }
            else {
                System.out.println("Number is negative");
            }
        }
    }
}
