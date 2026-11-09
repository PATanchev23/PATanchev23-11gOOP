class DoughMaker implements Runnable {
    int doughmakers;
    DoughMaker(int doughmakers) {
        this.doughmakers = doughmakers;
    }

    @Override

    public void run()
    {
        for(int i = 1; i <= doughmakers; i++)
        {
            System.out.println("Worker " + i + " is preparing dough");
        }
    }
}
