package day25;

import java.util.Arrays;

public class Task1_Merge {

    public static void main(String[] args) {

        int[]num1 ={1,2,3,4,5,6};
        int[]num2 = {7,8,9,10,11,12};

        int[] num = merge(num1, num2);

        System.out.println(Arrays.toString(num));

        System.out.println("-------------------------------------------------");

        double[]num3={1.2, 2.3, 3.4, 4.5, 5.6};
        double[]num4={6.7, 7.8, 8.9, 9.0};

        double nums[]=merge(num3,num4);
        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------------------");

        String []str1 = {"Java", "Python", "C#", "C++"};
        String []str2 = {"Cydeo", "School", "Java", "Programming"};

        String []strs =merge(str1, str2);
        System.out.println(Arrays.toString(strs));

        System.out.println("------------------------------------");

        char []ch1 = {'a','b','c','d'};
        char []ch2 = {'e','f','g','h'};
        char[]chars=merge(ch1,ch2);
        System.out.println(Arrays.toString(chars));
    }

    public static int []merge(int []array1, int [] array2){

        int []result =new int[array1.length + array2.length];

        int j=0;
        for (int each : array1) {
           result[j++]=each;

        }
        for (int each : array2) {
            result[j++]=each;

        }
        return result;
        }

        public static double []merge(double[] array1, double []array2){

        double []result=new double[array1.length + array2.length];

        int j =0;
            for (double each : array1) {
                result[j++]=each;

            }
            for (double each : array2) {
                result[j++]=each;


            }
            return result;
        }


        public static String[]merge(String[]array1, String[]array2){

        String[]result=new String[array1.length + array2.length];

        int j = 0;
            for (String each : array1) {
                result[j++]=each;


            }
            for (String each : array2) {
                result[j++]=each;


            }
            return result;
        }
        public static char[]merge(char[]array1, char []array2){
        char[]result=new char[array1.length + array2.length];

        int j =0;
            for (char each : array1) {
                result[j++]=each;


            }
            for (char each : array2) {
                result[j++]=each;

            }
            return result;
        }
    }


/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

 */