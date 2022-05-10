package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5_MaxNum {

    public static void main(String[] args) {



        ArrayList<Integer>list =new ArrayList<>();

        list.addAll(Arrays.asList(4,67,-9,0,-78,98,34,6));

        int max =list.get(0);
        for (Integer each : list) {
            if (each >max){
                max =each;
            }

        }
        System.out.println(max);
    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */