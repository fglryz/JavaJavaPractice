package day24;

import java.util.Arrays;

public class Task10_Removes {

    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5,6,7};
       int []newArr=  removeElement(arr,2);

        System.out.println(Arrays.toString(newArr));


    }
    public static int []removeElement(int[]array,int index){

        int result[]=new int[array.length-1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i ==index){
                continue;


            }
            result[j++]=array[i];

        }

        return result;
    }


}

/*
10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}


 */