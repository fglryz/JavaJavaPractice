package day21;

import java.util.Arrays;

public class Task1_Reverse {
    public static void main(String[] args) {

        int num[]= {1,-12,0,-3,2,3,4,5,6,9,20,54,};

        Arrays.sort(num);

        int reverse[]= new int[num.length];

        for (int i = num.length-1,j =0; i >=0 && j<num.length ; i--,j++) {
            reverse[i]=num[j];
        }

        System.out.println(Arrays.toString(reverse));

    }
}
//1. Write a program that sort the array of integer in descending order