package day09;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '±';

        if (ch >=65  && ch <= 90){
            System.out.println("Alphabet char");
        }
        else if (ch >= 48 && ch <= 57){
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }


    }
}
/*
4. Create a class called Character Identity, and write a program that can identify
if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the characters on ASCII table

 */