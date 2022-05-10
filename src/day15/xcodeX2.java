package day15;

import java.util.Locale;
import java.util.Scanner;

public class xcodeX2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();
        String result = "";
        String result2 ="";

        if (word.contains("x") && word.contains("X")){
           result = word.toLowerCase().replaceAll("x","a");

        }
        System.out.println(result );
input.close();
    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */