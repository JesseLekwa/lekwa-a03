package baseline;

import java.util.Scanner;

public class Solution28 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int input;

        // loop to prompt user for 5 numbers
        while(count < 6) {
            System.out.println("Enter a number:");
            input = sc.nextInt();
            // compute the total of the number
            sum +=input;
            count ++;
        }

        System.out.println("The total is "+sum+".");//total
    }
}