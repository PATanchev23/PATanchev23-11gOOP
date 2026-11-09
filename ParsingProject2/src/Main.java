import java.util.Scanner;

public class Main {
    public static int countVowels(String text)
    {
        int count = 0;
        for(int i = 0;i < text.length();i++)
        {
            char ch =Character.toLowerCase(text.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'а' || ch == 'е' || ch == 'и' || ch == 'о' || ch == 'у')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println("Numbers of vowels: " + countVowels(text));
    }
}