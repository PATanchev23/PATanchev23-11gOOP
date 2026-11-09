class Counter {

    private int counter = 0;

    public synchronized void increment(int value) {
        counter += value;
    }

    public int getCounter() {
        return counter;
    }
}

public class Main {

    public static void main(String[] args)
    {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment(1);
                }
        });

        Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment(2);
                }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Възникна грешка " + e.getMessage());
        }
        System.out.println("Краен резултат: " + counter.getCounter());
    }
}