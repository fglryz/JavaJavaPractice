package day13;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();


        String result = " ";
        if (word.length ()==5){
            result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);

        }else if (word.length() > 5){
            result = "Too long!";
        }else{
            result = "too short";


        }

        System.out.println(result);
input.close();
    }
}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display the message: "Too long!".
	Otherwise, reverse this word and print out the result into the console.

 */