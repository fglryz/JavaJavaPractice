package day15;

public class ReverseGiven {

    public static void main(String[] args) {

        String word ="Wooden Spoon";

        for (int i = word.length()-1; i >=0 ; i--) {

            char ch = word.charAt(i);
            System.out.print(ch);

        }



    }
}
/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */