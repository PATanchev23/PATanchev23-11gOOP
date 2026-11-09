public class Numbers {

    int number;
    Numbers(int number)
    {
        this.number = number;
    }

    void checkNumber()
    {
        if(number % 2 ==0)
        {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
