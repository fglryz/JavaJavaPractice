package day13;


import java.util.Scanner;

public class CheckFirstAndLast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write a program and enter a word");
        String word = scan.nextLine();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);



        if (firstChar == lastChar){
            System.out.println("same");
        }else {
            System.out.println("");
        }


    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */