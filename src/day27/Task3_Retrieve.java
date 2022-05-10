package day27;

public class Task3_Retrieve {

    public static void main(String[] args) {


    String str ="WoodenSpoon12345654$%&*@#£";
    String digits="";
    String letter="";
    String specialChar ="";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
                letter +=each;
            }
           else if (Character.isDigit(each)){
               digits +=each;
           }
           else {
               specialChar += each;
            }

        }
        System.out.println("letter = " + letter);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = "+ specialChar);


    }

}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";

 */