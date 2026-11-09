package Exercise2;

public class Main {
    public static void main(String[] args)
    {
        String name = "Bagel";
        double price = 2.50;
        int quantity = 100;
        boolean available  = true;

        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
        System.out.println("Product quantity: " + quantity);

        if(available == true)
        {
            System.out.println("Product is available");
        }
        else
        {
            System.out.println("Product is not available");
        }
    }

}
