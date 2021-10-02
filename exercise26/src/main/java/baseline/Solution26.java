/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 jesse lekwa
 */


package baseline;

import java.util.Scanner;

public class Solution26 {
    public static int calculateMonthsUntilPaidOff(double balance, double apr, double payment) { //function to calculate months

        //formula
        apr = apr / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));
}
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double balance, apr, payment;

        System.out.print("What is your balance? ");
        balance = scanner.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = scanner.nextDouble();
        apr = apr / 100;//apr percentage output calculator

        System.out.print("What is the monthly payment you can make? ");
        payment = scanner.nextDouble();

        int months = calculateMonthsUntilPaidOff(balance, apr, payment);
        System.out.println("It will take " + months + " months to pay off this card.");
    }
}

