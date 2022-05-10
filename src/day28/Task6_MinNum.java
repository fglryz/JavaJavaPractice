package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6_MinNum {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.addAll(Arrays.asList(4,65,-98,9,45,3,0,-2,-123));

        int min= list.get(0);

        for (Integer each : list) {
            if (each<min){
                min = each;
            }

        }
        System.out.println(min);
    }
}
/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */