package day25;

import java.util.Arrays;

public class Task4_Integer {

    public static void main(String[] args) {
        int[]num1 = {1,2,3,4,5,6};
        int newNum = reverse(num1);
        System.out.println("newNum = " + newNum);

        System.out.println("-----------------------------------");

        String []word = {"Java is a programming language"};
        String newSit = reverse(word);
        System.out.println("newSit = " + newSit);
        
        
    }
//1. Create a method that can reverse an integer array
    public static int reverse (int [] numbers){

        int result=0;
        for (int i = numbers.length-1; i >=0; i--) {
            System.out.println(i);
        }
        return result;
    }
    //2. Create a method that can reverse a double array
    public static double reverse (double [] numbers) {

        double result = 0;
        for (double i = numbers.length - 1; i >= 0; i--) {
            System.out.println(i);
        }
        return result;
    }

    //3. Create a method that can reverse a char array
    public static String reverse(String [] str){
        String result="";

        for (int i = str.length-1; i >=0 ; i--) {
            System.out.println(i);

        }
return result;
    }
}
/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */