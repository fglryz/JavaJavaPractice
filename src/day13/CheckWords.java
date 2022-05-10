package day13;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter three words");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        int length1 = word1.length();
        int length2 =word2.length();
        int length3 = word3.length();
        String result = " ";
        if (length1 == length2 && length2 == length3){
            result ="All words are same length";

        }else if (length1 ==length2 && length2 != length3 ||length2 == length3 && length2 != length1){
            result = "Not Same nor Different lengths";
        }else {
            result = "Not Same nor Different lengths";
        }
        System.out.println(result);

        input.close();

    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"


 */