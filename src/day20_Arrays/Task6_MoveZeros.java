package day20_Arrays;

import java.util.Arrays;

public class Task6_MoveZeros {

    public static void main(String[] args) {

      int numbers[]= {10, 0, 5, 0, 1, 0};

        Arrays.sort(numbers);

        int newNum []= new int[numbers.length];

        for (int i = 0, j= numbers.length-1; i < numbers.length && j>=0 ; i++,j--) {

            newNum[i]=numbers[j];
        }
        System.out.println(Arrays.toString(newNum));
    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */