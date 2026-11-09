import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        int doughmakers = input.nextInt();
        DoughMaker t1 = new DoughMaker(doughmakers);
        Thread thread1 = new Thread(t1);
        thread1.start();
        thread1.join();
        int baker = input.nextInt();
        Baker t2 = new Baker(baker);
        Thread thread2 = new Thread(t2);
        thread2.start();
        thread2.join();
        int delivery = input.nextInt();
        DeliveryWorker t3 = new DeliveryWorker(delivery);
        Thread thread3 = new Thread(t3);
        thread3.start();
        thread3.join();
    }
}