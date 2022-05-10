package day14;

import java.util.Scanner;

public class EndWithLy {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a word");
        String str = input.next();

        boolean result = str.endsWith("ly");
        if (result == true) {
            System.out.println("really");
        }else {
            System.out.println("never mind");

            input.close();
        }


    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */