package day13;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Write first word word");
        String firstWord = input.next();

        System.out.println("Write second word");
        String secondWord = input.next();

        char fw = firstWord.charAt(0);
        char sw = secondWord.charAt(0);

        String initial = (fw + "."+sw);
        System.out.println("initial = " + initial);

    }
}
/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output

 */