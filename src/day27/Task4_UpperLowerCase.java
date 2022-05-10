package day27;

public class Task4_UpperLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java PYTHON pythonP";

        char []ch =str.toCharArray();


        int countUpper =0;
        int countLower =0;

        for (char each : ch) {
            if (Character.isUpperCase(each)){
                countUpper++;
            }if (Character.isLowerCase(each)){
                countLower++;
            }

        }
        boolean isEqual = countUpper == countLower;
        System.out.println(isEqual);

    }


}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */