import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = input.nextInt();
        System.out.println("Enter y: ");
        int y = input.nextInt();

        Point point = new Point(x, y);

        System.out.println("The distance between points is: " + point.distance());

        System.out.println("Enter x1: ");
        int x1 = input.nextInt();
        System.out.println("Enter y1: ");
        int y1 = input.nextInt();
        System.out.println("The distance between points is: " + point.distance(x1, y1));
    }
}
