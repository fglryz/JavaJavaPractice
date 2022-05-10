package day24;

import java.util.Arrays;

public class Contains {

    public static void main(String[] args) {

        int[] num={1,2,3,4,5,6,7,8,9,10};
     boolean hasContain=  contains(num, 10);
        System.out.println(hasContain);

    }

    public static boolean contains(int []array, int element){


        boolean result =false;

        for (int each : array) {
            if (each==element){
                result=true;
            }

        }
        return result;

    }
}
/*
9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false

 */