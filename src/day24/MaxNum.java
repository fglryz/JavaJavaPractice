package day24;

import java.util.Arrays;

public class MaxNum {

    public static void main(String[] args) {
        int []num= {19, 54, 65, -98, 43, 21, 1, 2, 65};
       maxNum(num);
        System.out.println(Arrays.toString(num));
      //  maxNum(new int[]{1, 2, 3, 4});

    }
    public static void maxNum(int[]array){
        Arrays.sort(array);

        System.out.println(array[array.length-1]);
    }
}
