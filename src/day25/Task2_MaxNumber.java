package day25;

import java.util.Arrays;

public class Task2_MaxNumber {

    public static void main(String[] args) {

      int num[]={1,43, 56, 0, 78};

        int max1 = max(num);
        System.out.println("max1 = " + max1);

        System.out.println("--------------------------------");


        double num2[]={1.2, 2.3, 3.4, 4.5};

        double max2 = max(num2);
        System.out.println("max2 = " + max2);



    }
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
    public static long max(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
    public static short max (short[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static float max(float[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    public static byte max(byte [] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
}
/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array


 */