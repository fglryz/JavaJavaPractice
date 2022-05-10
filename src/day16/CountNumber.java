package day16;

import java.util.Scanner;

public class CountNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Five Numbers");

        int positiveNum = 0;
        int negativeNum = 0;

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();


            if (num > 0) {

                positiveNum++;


            } else if (num <0){
                negativeNum++;
            }

        }

        System.out.println(positiveNum+" positive and "+negativeNum+" negative");

input.close();
    }
}
/*
1. Write a program that asks user to enter number for 5 times,
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative


 */