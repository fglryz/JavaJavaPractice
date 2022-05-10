package day22_Methods;

import java.util.Arrays;

public class Task1_2DArray {

    public static void main(String[] args) {

       int [][] arr = { {1,2,3}, {4,5,6}};




        String reverse="";
        for (int i =arr.length-1 ; i >=0; i--) {



            System.out.println(Arrays.deepToString(arr));
            System.out.println(reverse);
        }


        System.out.println();

        }
/*
 String reverseSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {

            reverseSentence += words[i]+" ";


        }
        System.out.println(reverseSentence);
    }
 */

    }

/*
1. Write a program that can reverse a two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

		output:
			reverse = { {6,5,4}, {3,2,1},};

 */