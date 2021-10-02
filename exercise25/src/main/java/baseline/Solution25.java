/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 jesse lekwa
 */

package baseline;

import java.util.Scanner;
import java.util.*;

public class Solution25 {
    public static void passwordValidator(String input)
    {
        //function for checking alphabet cases
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())//for loop to determine complexity of cases
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }


        if (hasDigit && hasLower || hasUpper && specialChar// to check for both number and letter in password
                && (n >= 8))
            System.out.println("Very Strong");
        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            System.out.println("Strong");
        else if(hasLower || hasUpper)
            System.out.print("Weak");
        else
            System.out.print("Very Weak");// print statements

    }


    public static void main(String[] args)//main function
    {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: ");// prompt user for password
        input=sc.nextLine();
        passwordValidator(input);
    }

}
