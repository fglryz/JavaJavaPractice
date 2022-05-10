package day13;

import java.util.Scanner;

public class LongString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        int firstWord = word1.length();
        int secondWord = word2.length();
        String result = " ";
        if (firstWord > secondWord){
            System.out.println("First one is longer");
        }else {
            System.out.println("Second one is longer");
        }
        System.out.println(result);

        input.close();
    }
}
/*
2. write a program that asks user to enter two strings, and print out the longest string
 */