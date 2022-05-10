package day10_IfElse;

import java.io.PrintStream;

public class BiggerNumber {

    public static void main(String[] args) {

        int num1 = 82;
        int num2 = 24;
        int num3 = 67;

        String result = " ";

        if (num1 > num2 && num1 >num3 || num2 > num1 && num2 > num3 || num3 > num2 && num3 > num1){

            if (num1 > num2 && num1 >num3){
                result = "num1 is the biggest";
            }else if (num2 > num1 && num2 > num3){
                result = "num2 is the biggest";
            }else {
                result = "num3 is the biggest";
            }

        }else {
            result = "Invalid";
        }
        System.out.println( result);

        System.out.println("--------------------------------------------------------");

        String result2 = (num1 > num2 && num1 >num3)? "num1 is the biggest"
                    : (num2 > num1 && num2 > num3)? "num2 is the biggest" :  "num3 is the biggest";
        System.out.println(result);



    }
}
/*
5. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY

 */