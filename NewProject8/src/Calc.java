public class Calc {

    public int sum(int[] number1)
    {
        int sum = 0;

        for(int i = 0; i < number1.length; i++)
        {
            sum += number1[i];
        }
        return sum;
    }

}
