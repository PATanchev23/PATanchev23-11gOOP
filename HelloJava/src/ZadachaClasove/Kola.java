package ZadachaClasove;
import java.util.Scanner;

public class Kola {
     static int calcSum() {
         Scanner input = new Scanner(System.in);
         int a = input.nextInt();
         input.nextLine();
         int b = input.nextInt();
         input.nextLine();
         return a + b;
    }
    public static void main(String[] args) {
        int result = calcSum();
        System.out.println(result);
    }
}
