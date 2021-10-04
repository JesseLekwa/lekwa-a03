package baseline;

import java.util.Scanner;
import java.util.Random;

public class Solution33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("What is your question? ");// prompt the user for question
        String input = sc.nextLine();
        Random random = new Random();


        String [] possible = {"Yes", "No", "Maybe", "Ask again later"};//store question in yes, no, maybe...

        int randomResponse = random.nextInt(possible.length); // randomise response
        String response = possible[randomResponse];


        System.out.println(""+response+"");//print response

    }
}