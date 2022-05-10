package day14;

import java.util.Scanner;

public class Low_UpCase {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a word");
        String word = input.next();

        String result = " ";

        if (word.charAt(0)>=48 && word.charAt(0) <=57){
            result= "first character is digit";

        }else if (word.charAt(0)>=65 && word.charAt(0)<=90){
            result = "first character is uppercase letter";

        }else if (word.charAt(0)>=97 && word.charAt(0)<=122){
            result = "first character is lowercase letter";

        }else {
            result = "first character is special character";
        }
        System.out.println(result);

        char firstChar = word.charAt(0);
        String result2 ="";

        if (firstChar >='0' && firstChar <='9'){
            result2 = "first character is digit";

        }else if (firstChar >= 'a' && firstChar <= 'z'){
            result2 = "first character is lowercase letter";

        }else if (firstChar >= 'A' && firstChar <= 'Z'){
            result2 = "first character is uppercase letter";

        }else {
            result2 = "first character is special character";
        }
        System.out.println(result2);


input.close();
    }
}
/*
5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table


 */