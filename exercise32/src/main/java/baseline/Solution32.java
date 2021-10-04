package baseline;

import java.util.Scanner;

public class Solution32 {
    public static void main( String args[] )
    {
        // declare the variables
        // console input of difficulty level
        // take random number as per level of difficulty

        int i,n,g,a,c=0;
        char ch='y';
        Scanner sc=new Scanner(System.in);
        System.out.println("\nLets play Guess Number!\n");

        while(ch=='y' || ch=='Y')
        {
            System.out.print("\nEnter the difficulty level ( 1,2, or 3) : ");
            n=sc.nextInt();

            g= (int)Math.floor(Math.random()*(Math.pow(10,n)-1+1)+1);
            System.out.print("I have my number. What's your guess? ");
            while(true)
            {

                a= sc.nextInt();

                if(g==a)
                {
                    c++;

                    System.out.println("You got in " + c + " guesses !");// print statement for total guesses
                    break;
                }

                else if(g>a)//if statement
                {
                    System.out.print("Too low. Guess again: ");
                    c++;
                }

                else if(g<a)
                {
                    System.out.print("Too high. Guess again: ");
                    c++;
                }
            }
            System.out.print("\nDo you wish to play again (Y/N)?");
            ch=sc.next().charAt(0);
            c=0;
        }
    }
}
