package Exercise9;

/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Bernard Fonrose
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercise9 {
    public static void main(String[] args){

        Scanner Estimate = new Scanner(System.in);

        System.out.print("How much square feet are you trying to paint:");

        String STRcanvas = Estimate.nextLine();

        double canvas = Integer.parseInt(STRcanvas, 10);

        double paint_amount = 350;

        double conversion = canvas / paint_amount;

        conversion = Math.ceil(conversion);

        System.out.printf("You will need %f buckets of paint", conversion);


    }
}
