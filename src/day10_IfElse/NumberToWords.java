package day10_IfElse;


    public class NumberToWords {

        public static void main(String[] args) {

            int number = 6;
//TERNARY
            String result = (number >= 0 && number <= 9) ? (number == 0) ? "Zero" : (number == 1) ? "one" : (number == 2) ? "two"
                    : (number == 3) ? " three" : (number == 4) ? "four" : (number == 5) ? "five"
                    : (number == 6) ? "Six" : (number == 7) ? "Seven" : (number == 8) ? "Eight" : "Nine" : "Invalid";

            System.out.println(result);


            System.out.println("--------------------------------------------");
//NESTED_IF
            if (number >= 0 && number <= 9) {
                if (number == 0) {
                    result = "Zero";
                } else if (number == 1) {
                    result = "One";
                } else if (number == 2) {
                    result = "Two";
                } else if (number == 3) {
                    result = "Three";
                } else if (number == 4) {
                    result = "Four";
                } else if (number == 5) {
                    result = "Five";
                } else if (number == 6) {
                    result = "Six";
                } else if (number == 7) {
                    result = "Seven";
                } else if (number == 8) {

                } else {
                    result = "Nine";
                }
            } else {
                result = "The number is invalid";
            }
            System.out.println(result);
        }
    }
/*
2. Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary

 */

