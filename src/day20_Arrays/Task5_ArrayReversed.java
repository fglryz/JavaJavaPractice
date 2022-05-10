package day20_Arrays;

import java.util.Arrays;

public class Task5_ArrayReversed {

    public static void main(String[] args) {

        int[]num = {1,2,3,4,5};
        int []reverse =new int[num.length];

        for (int i = num.length -1,j=0; i >=0 && j<num.length ; i--,j++) {

            reverse[i]=num[j];


        }
        System.out.println(Arrays.toString(reverse));
    }
}
 /*
 Write a program that can reserve an array of integers and returns it as new array

 ex:
     array={1,2,3,4,5};

     output:
            {5,4,3,2,1}
  */