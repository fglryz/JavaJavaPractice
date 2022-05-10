package day17;

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);


        while(true) {


            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter second number");
            int num2 = input.nextInt();
            if (num1 >=0 && num2 >=0){

                System.out.println(num1 + num2);
            }


            if ( !(num1>=0 &&num2>=0)){
               break;

            }
        }


    }
}
/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop


 */