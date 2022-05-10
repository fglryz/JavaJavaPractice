package day13;

import java.util.Scanner;

public class EnterAString {

    public static void main(String[] args) {

        Scanner input = new  Scanner(System.in);

        System.out.println("Enter a string");
        String word = input.next();
        String result = " ";

        char thirdChar =word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);


/*
String word = "Cydeo";
            //index:   01234
        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);


 */
    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */