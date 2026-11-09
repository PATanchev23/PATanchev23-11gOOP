class Baker implements Runnable {
    int baker;
    Baker(int baker)
    {
        this.baker = baker;
    }

    @Override
    public void run()
    {
        for(int i = 1;i <= baker;i++)
        {
            System.out.println("Baker " + i + " is baking bread");
        }
    }
}
