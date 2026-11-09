package ArrayExercise;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Koev" , "misho"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        double[] numbers  = {5.50 , 6.01 , 4.75};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] <= 6.00 && numbers[i] >= 2.00) {
                System.out.println(numbers[i]);
            }
            else
            {
                System.out.println("Grade " + numbers[i] + " should be above 2.00 and under 6.01");
            }
        }
        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;
    }
}
