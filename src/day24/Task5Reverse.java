package day24;

import java.util.Arrays;

public class Task5Reverse {

    public static void main(String[] args) {

        int [] arr = {1,1,1,1,1,2,2};


        int num = frequency(arr,1);

     System.out.println(num);



    }
    public static int frequency(int [] array, int element){

        int frequency =0;
        for (int each : array) {
            if( each == element){
                frequency++;
            }
          
        }
        return frequency;
    }

}
/*
 5. create method that accepts one integer array and one integer number and returns
 the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */