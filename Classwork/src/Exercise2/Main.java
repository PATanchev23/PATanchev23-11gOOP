package Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int absences = input.nextInt();
        double averagegrade = input.nextDouble();
        char firstLetter = input.next().charAt(0);
        boolean examTaken = input.nextBoolean();
        long sitesSeen = input.nextLong();

        System.out.println("Absences: " + absences);
        System.out.println("Average grade: " + averagegrade);
        System.out.println("First Letter: " + firstLetter);
        System.out.println("Exam Taken: " + examTaken);
        System.out.println("Sites Seen: " + sitesSeen);
    }
}
