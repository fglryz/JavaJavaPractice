package day27;

import java.util.Arrays;

public class Task2_Swap {

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int newArray[] = swap(nums,0,6);
        System.out.println(Arrays.toString(newArray));

        System.out.println("--------------------------------");

        double [] nums2 = {1.2, 3.5, 4.5, 6.5, 7.5, 8.5, 9.4};
        double [] newNums = swap(nums2, 0,6);

        System.out.println(Arrays.toString(newNums));

        System.out.println("--------------------------------");

        char []ch = {'a','b', 'c', 'd', 'e'};
        ch=swap(ch,0,4);
        System.out.println(ch);


        System.out.println("--------------------------------");

        String []str = {"Java", "C#", "asd", "gtr", "Python"};
        String []newStr= swap(str, 0, 4);
        System.out.println(Arrays.toString(newStr));
    }

    public static int []swap(int[]array,int i, int j){
        int temp= array[i];
        array[i]=array[j];
        array[j]=temp;

        return array;
    }

    public static double[] swap (double[]array, int i, int j ){

        double temp = array[i];
        array[i]= array[j];
        array[j]=temp;

        return array;
    }

    public static char[] swap (char[] array, int i, int j){
        char temp = array[i];
        array[i] =array[j];
        array[j]=temp;

        return array;


    }

    public static String[]swap(String []array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j]= temp;

        return array;
    }
}
/*


2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array


 */