package day15;

public class DigidNumberChar {

    public static void main(String[] args) {
       String str = "kdnvbg64538$@!^*1234NBVyyhjgf?~±@";

       String digit = "";
       String letters = "";
       String specialChars = "";

        for (int i = 0; i < str.length() ; i++) {

          char  ch = str.charAt(i);

       if (ch >= '0' && ch <= '9') {

          digit +=ch;
       }
       else if (ch>='a'&& ch<='z'  ||ch>='A'&& ch <='Z'){
           letters += ch;
       }else {
           specialChars +=ch;

       }

        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digit = " + digit);
    }
}
/*
5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */