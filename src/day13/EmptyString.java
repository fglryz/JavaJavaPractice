package day13;

import java.util.Scanner;

public class EmptyString {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a string");
        String str1 = input.nextLine();
        String result = " ";

        int length = str1.length();
        if (length == 0){
            result = "string is empty";
        }else if (length > 3 ){

            result = "" + str1.charAt(length-3)+str1.charAt(length-2)+str1.charAt(length-1);
        }else {
            result = str1;
        }
        System.out.println(result);


input.close();
    }
}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */