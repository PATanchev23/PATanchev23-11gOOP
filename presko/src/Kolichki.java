class Motor implements Runnable {
    private String brand;
    public Motor(String brand)
    {
        this.brand = brand;
    }
    @Override
    public void run()
    {
        for(int i = 1;i <= 5;i++)
        {
            System.out.println(brand + " premina etap " + i + " ot 5");
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(brand + " beshe prekusnat");
            }
        }
        System.out.println(brand + " finishira");
    }
}

public class Main {
    public static void main(String[] args)
    {
        Motor moto1 = new Motor("Yamaha");
        Motor moto2 = new Motor("Honda");
        Motor moto3 = new Motor("Kawasaki");
        Thread t1 = new Thread(moto1);
        Thread t2 = new Thread(moto2);
        Thread t3 = new Thread(moto3);
        t1.start();
        t2.start();
        t3.start();
    }
}