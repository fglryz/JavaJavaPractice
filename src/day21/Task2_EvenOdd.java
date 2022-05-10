package day21;

import java.util.Arrays;

public class Task2_EvenOdd {

    public static void main(String[] args) {

      int []num = {20, 44, 45, 50, 66,156, 69, 70};

      int countOdd =0;
      int countEven = 0;

        for (int each : num) {
          if (each % 2==0){
             countEven++;
          }else {
              countOdd++;
          }

        }
        System.out.println(Arrays.toString(num)+" has "+countEven+" even numbers and "+countOdd+ " odd number.");
    }
}//System.out.println(Arrays.toString(arr) +" has "+countEven+" even numbers and "+countOdd+" odd numbers");
//2. Write a program that can count the even and odd number from an array of integers
//
//			Note: MUST use for each loop