package day13;

import java.util.Scanner;

public class First_LastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String aSentence = input.nextLine();

        int length = aSentence.length();

        System.out.println("length = " + length);

        char firstChar = aSentence.charAt(0);

        System.out.println("firstChar = " + firstChar);

        char lastChar = aSentence.charAt(aSentence.length()-1 );

        System.out.println("lastChar = " + lastChar);
        input.close();
    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

 */