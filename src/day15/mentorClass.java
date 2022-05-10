package day15;

import java.util.Scanner;

public class mentorClass {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a word");

        String word =input.nextLine();

        //String word = "Java is a fun programming language";
        int result = 0;

        for (int i= 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' || word.charAt(i)=='A'){
                result++;
            }



        }
        System.out.println( "a is appeared "+  result +" times");
        input.close();
    }
}
/*
in a given string how many times a appears in it
 */