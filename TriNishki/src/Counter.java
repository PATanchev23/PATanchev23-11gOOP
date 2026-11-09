class Counter {
    private int counter = 0;

    public synchronized void increment(int value) {
        counter += value;
    }

    public int getCounter() {
        return counter;
    }
}

class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        int iterations = 10000;

        Thread thread1 = new Thread(() -> {
            for(int i = 0;i < iterations;i++) {
                counter.increment(1);
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0;i < iterations;i++) {
                counter.increment(2);
            }
        });

        Thread thread3 = new Thread(() -> {
            for(int i = 0;i < iterations;i++) {
                counter.increment(3);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try
        {
            thread1.join();
            thread2.join();
            thread3.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Възникна грешка " + e.getMessage());
        }
        System.out.println("Краен резултат: " + counter.getCounter());
    }
}