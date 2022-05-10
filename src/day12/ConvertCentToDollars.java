package day12;

import java.util.Scanner;

public class ConvertCentToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents");
        int c = input.nextInt();

        int dollars = c / 100 ;
        int cents = c % 100 / 1;
        System.out.println(cents + " cent equal to: "+dollars + " dollars and "+ cents + " cents" );
        input.close();
    }
}
/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in
the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents


 */