package day15;

import java.util.Scanner;

public class PlindromaPractice {

    public static void main(String[] args) {

        String word = "civic";

        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            reversed += word.charAt(i);


        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println(isPalindrome);

        System.out.println("-----------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");

        String word2 =input.next();

        String reversed2 = "";

        for (int i =word2.length()-1; i >=0 ; i--) {

            reversed2 += word2.charAt(i);




        }

        boolean isPalendroma2 = word2.equalsIgnoreCase(reversed2);
        System.out.println(isPalendroma2);
        input.close();

    }
}
/*

        String word = "civic";
        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
           reversed += word.charAt(i);


        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true

                    input:
					Anna

				output:
					true

				input:
					Anna

				output:
					true

 */