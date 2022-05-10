package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task6_Add {

    public static void main(String[] args) {

        int [] arr = {1,3,2,4,5,6,4,7,8,9,6,5};
        int []newArr= addElement(arr,10);

        System.out.println(Arrays.toString(newArr));

        System.out.println("-----------------------------------------------");

        char [] arr2 ={'a', 'b','c','d','e','f'};
        char [] newChar =addElement(arr2,'g');
        System.out.println(Arrays.toString(newChar));


    }

    public static int []addElement(int []array, int element){

        int []result = new int[array.length+ 1];

        int num = 0;
        for (int each : array) {
            result[num++]=each;

        }
        result[num] = element;
       return result;
    }

    public static char[]addElement(char []array,char element){

        char[]result =new char[array.length+1];

        int i =0;
        for (char each : array) {

            result[i++]=each;

        }
        result[i]=element;
        return result;
    }

}
/*
public static int []addInteger (int [] array, int element){
       int result []= new int[array.length + 1];
        int i =0;
        for (int each : array) {
           result[i++] = each;

        }
        result[i] = element;

        return result;
    }
 */
/*
 6. create a method named addElement that takes one integer array and one integer,
  the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

 */