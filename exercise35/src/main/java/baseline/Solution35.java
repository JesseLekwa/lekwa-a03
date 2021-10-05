package baseline;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Solution35
{
    private static final Scanner in = new Scanner(System.in);
    private static final Random rand = new Random();

    private String getName()
    {
        System.out.println("Enter a name: ");//promp user for name

        return in.nextLine();
    }

    private int randomIndex(int length)
    {
        return rand.nextInt(length);
    }

    public String winner(ArrayList<String> names, int random)//store names in a string
    {
        return names.get(random);
    }

    public static void main(String[] args)
    {
        Solution35 main = new Solution35();
        ArrayList<String> names = new ArrayList<>();

        String name;

        while(true)
        {
            name = main.getName();

            if(name.equals(""))//if statement to make sure blanks are not stored
            {
                break;
            }
            else
            {
                names.add(name);
            }
        }

        int random = main.randomIndex(names.size());

        String winnerName = main.winner(names, random);// function to generate random name

        System.out.printf("The winner is... %s.", winnerName);// print name
    }

}