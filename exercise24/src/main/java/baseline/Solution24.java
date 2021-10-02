/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 jesse lekwa
 */

package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    static boolean isAnagram(String str1, String str2) {//calling function isAnagram
        String s1 = str1.replaceAll("\\s","");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {//adding if/else statement that checks the length of both inputs to determine anagram
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");//print statements
        System.out.print("Enter the first string: ");
        String str1=sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2=sc.nextLine();
        if(isAnagram(str1,str2))
            System.out.println(str1 + " and " + str2 + " are anagrams");
        else
            System.out.println(str2 + " and " + str2 + " are not anagrams");

    }
}
