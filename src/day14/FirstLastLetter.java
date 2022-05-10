package day14;

import java.util.Scanner;

public class FirstLastLetter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        if (word.charAt(word.length()-1) ==word2.charAt(0)){
            System.out.println(word.substring(0)+ word2.substring(1));
        }

      input.close();
    }
}
/*

    4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */