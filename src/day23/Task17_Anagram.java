package day23;

import java.util.Arrays;

public class Task17_Anagram {

    public static void main(String[] args) {

        anagram("listen", "silent");

    }

    public static void anagram(String word1, String word2){

        char []ch1 =word1.toCharArray();
        char []ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch1));

        boolean anagram =Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);


    }
}
/*

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1, ch2)
        System.out.println("anagram = " + anagram);

 */

/*
17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram

 */