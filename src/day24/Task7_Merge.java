package day24;

import java.util.Arrays;

public class Task7_Merge {

    public static void main(String[] args) {
        int []n1 = {1,2,3,4,5};
        int[]n2 ={6,7,8,9,10};
        int[]n3 = merge(n1,n2);

        System.out.println(Arrays.toString(n3));
    }


    public static int[]merge(int []array1,int []array2){


        int[]result1 = new int[array1.length + array2.length];


        int i = 0;


        for (int each : array1) {
            result1[i++] = each;

        }
        for (int each : array2) {
            result1[i++]=each;


        }

return (result1);


    }

}
/*
7. Create a method named merge that passes two integer array parameters,
 the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}


				*/