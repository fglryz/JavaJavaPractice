package day15;

import java.util.Scanner;

public class FullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter fist name and second name");
        String word1 = input.next();
        String word2 = input.next();

        System.out.println(word1.toUpperCase().charAt(0)+word1.toLowerCase().substring(1)+ " "
                + word2.toUpperCase().charAt(0)+word2.toLowerCase().substring(1));

input.close();


    }
}
/*

	3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */