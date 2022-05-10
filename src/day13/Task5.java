package day13;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = input.next();

       int length = word.length();
        String result = " ";

        if (length == 0){
            result = "Empty";

        }else if (word.length() >3){
            int lastIndexOf = word.length()-1;
            result = ""+ word.charAt(length - 3)+ word.charAt(length - 2)+ word.charAt(length - 1);

        }else {
            result = word;
        }System.out.println(result);
        input.close();
    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 if(length == 0){
            result = "Empty";
        } else if (length > 3){
            int lastIndex = word.length() - 1;
            result = ""+ word.charAt(length - 3)+ word.charAt(length - 2)+ word.charAt(length - 1);
        }else {
            result = word;
 */