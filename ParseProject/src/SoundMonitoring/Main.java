package SoundMonitoring;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static double average(double[] values)
    {
        double sum = 0;
        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        return sum / values.length;
    }
    static double max(double[] values)
    {
        double max = values[0];
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] > max)
                max = values[i];
        }
        return max;
    }
    static int countAbove(double[] values, double limit)
    {
        int count = 0;
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] > limit)
                count++;
        }
        return count;
    }
    public static void main(String args[]) throws IOException
    {
        Scanner input = new Scanner(System.in);

        double[] values = new double[5];

        for(int i = 0;i < values.length;i++)
        {
            System.out.print("Enter noise in dB: ");
            String dB = input.nextLine();
            values[i] = Double.parseDouble(dB);

        }

        System.out.println("Average: " + average(values));
        System.out.println("Max: " + max(values));
        System.out.println("Count: " + countAbove(values, 75));
    }
}
