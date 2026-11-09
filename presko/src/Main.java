 class Main implements Runnable{
    private String threadName;

    public Main(String name) {
        this.threadName = name;
    }

    @Override

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + "izpulnqwana stypka" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + "Beshe prekusnata");
            }
        }
        System.out.println("--->" + threadName + "Prikluchi rabota");
    }
}

 class WorkTask {
    public static void main(String[] args) {
        System.out.println("Glavnata nishka startira");

        Main task1 = new Main("nishka A");
        Main task2 = new Main("nishka B");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        System.out.println("--->" + thread1.getName() + thread2.getName());
    }
}
