package day24;

import java.util.Arrays;

public class Task2_IsAnagram {

    public static void main(String[] args) {


        isAnagram("name","mean");

    }
    public static void isAnagram (String str1, String str2){

        char []ch1 = str1.toCharArray();
        char []ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);


       /*
       System.out.println();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch1));

        boolean anagram =Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);

        */

    }

}
/*

    2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true


 */