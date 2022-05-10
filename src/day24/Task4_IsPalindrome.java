package day24;

public class Task4_IsPalindrome {

    public static void main(String[] args) {


        String str = "level";

      boolean result =isPalindrome(str);
        System.out.println(result);




    }

    public static boolean isPalindrome(String str){

        String result ="";

        for (int i =str.length() -1; i >=0 ; i--) {
            result+=str.charAt(i);

        }
        return result.equalsIgnoreCase(str);

    }

}
/*

	4. By using the reverse method above to create another method named isPalindrome
	 that passes a String parameter, the method returns true if the string is palindrome,
	  otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true


 */