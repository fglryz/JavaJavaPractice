package day14;

import java.util.Scanner;

public class FirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter first words");
        String str = input.next();

        System.out.println("Enter second word");
        String str2 = input.next();

        String result = str.substring(1);
        String result2 = str2.substring(1);

        System.out.println(result+result2);

        input.close();








    }
}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */