/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        Integer principle = scan.nextInt();
        System.out.print("Enter the rate of interest: ");
        Double rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        Integer years = scan.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        Integer compounds = scan.nextInt();

        double rate_percent = rate / 100.0;

        // this is such a pain, but there is a typo in the question its P((1 + r/n)^(n*t))
        double exp = Math.pow(1+(rate_percent / compounds), (compounds*years));
        double end_amount = principle * exp;

        System.out.println(String.format("$%d invested at %.01f%% for %d years compounded %d times per year is $%.02f.", principle, rate, years, compounds, end_amount));
    }
}
