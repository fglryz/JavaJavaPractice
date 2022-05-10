package day16;

import java.util.Scanner;

public class MultiplyNumber {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter two positive numbers");
        int num =input.nextInt();
        int num2 =input.nextInt();
            int count = 0;
        for (int i = 0; i <num ; i++) {

                count +=num2;

            }
        System.out.println("count = " + count);
        input.close();
        }

    }

/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

 */