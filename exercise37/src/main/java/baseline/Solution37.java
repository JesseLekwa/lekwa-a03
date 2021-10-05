package baseline;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Solution37
{
    private static final Scanner in = new Scanner(System.in);

    public String passwordGenerator(int length, int special, int number)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()_+{}[]<>?,.~";
        String digits = "1234567890";

        int lettersRequired = number + special;

        length = length + lettersRequired + special + number;

        int trueLength = ThreadLocalRandom.current().nextInt(length, length + 10);

        int count = 0;

        StringBuilder password = new StringBuilder();

        while(count < trueLength)
        {
            int letterIndex = ThreadLocalRandom.current().nextInt(0, alphabet.length());
            password.append(alphabet.charAt(letterIndex));

            count++;
        }

        for(int i=0; i<special; i++)
        {
            int specialIndex = ThreadLocalRandom.current().nextInt(0, specialCharacters.length());

            int index = ThreadLocalRandom.current().nextInt(0, trueLength);

            password.insert(index, specialCharacters.charAt(specialIndex));
        }

        for(int j=0; j<number; j++)
        {
            int numberIndex = ThreadLocalRandom.current().nextInt(0, digits.length());

            int index = ThreadLocalRandom.current().nextInt(0, trueLength);

            password.insert(index, digits.charAt(numberIndex));
        }

        return password.toString();
    }

    private int input(String prompt)
    {
        System.out.println(prompt);

        return in.nextInt();
    }

    public static void main(String[] args)
    {
        Solution37 main = new Solution37();

        int length = main.input("What's the minimum length? ");// prompt user for minimum length
        int special = main.input("How many special characters? ");// prompt user for special characters
        int numbers = main.input("How many numbers? ");//prompt user for how many numbers

        String password = main.passwordGenerator(length, special, numbers);

        System.out.println("Your password is " + password);
    }
}