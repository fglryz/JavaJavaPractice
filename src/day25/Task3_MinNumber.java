package day25;

import java.util.Arrays;

public class Task3_MinNumber {

    public static void main(String[] args) {

        int num1 []={89, 76, -32, 0, 768};
        int min1 = min(num1);
        System.out.println("min1 = " + min1);

        System.out.println("---------------------------------------");
        byte [] num2 ={1, 3, 6, 7, 67, 62};
        byte min2 = min(num2);
        System.out.println("min2 = " + min2);


        //double, long..................
    }
    //1. create a method that can return the min number from an integer array
public static int min(int [] numbers){
    Arrays.sort(numbers);

    return numbers[0];
}

//2. create a method that can return the min number from double array
    public static double min(double [] numbers) {
        Arrays.sort(numbers);

        return numbers[0];
    }

    //3. create a method that can return the min number from long array
    public static long min(long[]numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //4. create a method that can return the min number from short array
    public static short min(short[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //5. create a method that can return the min number from float array
    public static float min(float[] numbers){

        Arrays.sort(numbers);
        return numbers[0];
    }

   //6. create a method that can return the min number from byte array
   public static byte min (byte[] numbers){

        Arrays.sort(numbers);
        return numbers[0];
   }
}
/*
Task 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array


 */