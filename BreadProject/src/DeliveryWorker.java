class DeliveryWorker implements Runnable
{
    int delivery;

    DeliveryWorker(int delivery)
    {
        this.delivery=delivery;
    }

    @Override
    public void run()
    {
        for(int i = 1;i <= delivery;i++)
        {
            System.out.println("DeliveryWorker " + i + " is delivering bread");
        }
    }
}
