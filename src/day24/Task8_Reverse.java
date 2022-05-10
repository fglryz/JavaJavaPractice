package day24;

import java.util.Arrays;

public class Task8_Reverse {

    public static void main(String[] args) {

        int []nums = {1,2,3,4,5,6};
       int []newNums=  reverse(nums);
        System.out.println(Arrays.toString(newNums));

    }
    public static int [] reverse(int []array){
        int []result=new int[array.length];

        int j = 0;
        for (int i = array.length-1; i >=0; i--) {


              result[j++]= array[i];



        }
        return result;
    }



}

/*

	8. Create method named reverse that passes an integer array parameter,
	the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */
