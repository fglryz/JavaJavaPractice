package day25;

import java.util.Arrays;

public class Task4_Reverse {

    public static void main(String[] args) {

        int []num = {1,2,3,4,5,6};
        int [] nums=reverse(num);
        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------");


        double[]num3={1.2, 2.3, 3.4, 4.5, 5.6};
       double[]nums2=reverse(num3);
        System.out.println(Arrays.toString(nums2));

        System.out.println("-----------------------------");

        char []ch1 = {'a','b','c','d'};
        char[]chars=reverse(ch1);
        System.out.println(Arrays.toString(chars));

        System.out.println("-----------------------------------");

        String []str2 = {"Cydeo", "School", "Java", "Programming"};

        String[]str3 =reverse(str2);
        System.out.println(Arrays.toString(str3));


    }
    public static int[]reverse(int []array){
        int[]result = new int[array.length];

        int j =0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }
        return result;
    }
    public static double[]reverse(double []array) {
        double[] result = new double[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];

        }
        return result;
    }
    public static char[]reverse(char[]array){
        char []result=new char[array.length];

        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];


        }
        return result;
    }

    public static String[]reverse (String[]array){
       String[]result= new String[array.length];

       int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]= array[i];


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