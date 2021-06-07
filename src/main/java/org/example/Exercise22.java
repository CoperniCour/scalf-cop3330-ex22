/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 22 - Comparing Numbers

package org.example;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        //Scan in 3 integers
        //Prompt user for height and weight
        Scanner getNumbers = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = getNumbers.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = getNumbers.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = getNumbers.nextInt();

        //Compare the numbers

         if(num1 > num2 && num1 > num3){
            System.out.println(String.format("The largest number is %d", num1));
        }

        else if(num2 > num1 && num2 > num3){
            System.out.println(String.format("The largest number is %d", num2));
        }

        else if(num3 > num2 && num3 > num1){
            System.out.println(String.format("The largest number is %d", num3));
        }
    }
}