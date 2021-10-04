package baseline;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float rate;
        try {
            System.out.print("Enter your Age : ");//prompt user for age
            int age = s.nextInt();
            System.out.print("Enter your resting heart rate : ");// prompt user for resting heart rate
            float heart_rate = s.nextFloat();
            System.out.println("Resting Pulse : " + heart_rate + "      Age : " + age);
            System.out.println("Intensity   | Rate");
            System.out.println("------------|----------");
            for (int i = 55; i <= 95; i += 5) {//loop for incrementing percentages from 55-95
                rate = (((220 - age) - heart_rate) * i/100) + heart_rate;
                System.out.println(i + "%" + "         | " + Math.round(rate) + " bpm");
            }
        } catch(Exception e) {
            System.out.println("Enter only numbers...");
        }
    }
}
