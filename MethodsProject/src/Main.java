public class Main {
    void biggestNum(int num1, int num2, int num3)
    {
        if(num1 >= num2 && num1 >= num3)
        {
            System.out.println("Biggest number is " + num1);
        }
        else if(num2 >= num1 && num2 >= num3)
        {
            System.out.println("Biggest number is " + num2);
        }
        else {
            System.out.println("Biggest number is " + num3);
        }
    }

    public static int countVowels(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}