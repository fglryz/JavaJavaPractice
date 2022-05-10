package day15;

import java.util.Scanner;

public class xcodeX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();
        String result = "";
        if (word.charAt(0)=='x'){
            result = word.replace("x", "a");
        }
        System.out.println(result);
input.close();
    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */