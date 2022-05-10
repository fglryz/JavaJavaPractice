package day23;

import java.util.Arrays;

public class OddAndEven {

    public static void main(String[] args) {

        oddNumber();

        System.out.println("----------------------------------------");

        evenNumber();
    }

    public static void oddNumber(){


        for (int i = 1; i <=100 ; i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public static void evenNumber (){

        for (int i = 1; i <=100 ; i++) {

            if (i % 2 == 0){
                System.out.print(i+ " ");
            }

        }
        System.out.println();
    }
}
//1. create a method that can print odd numbers between 1~100 in a same line saperated by space