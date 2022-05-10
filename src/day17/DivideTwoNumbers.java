package day17;



public class DivideTwoNumbers {

    public static void main(String[] args) {

        int num1 = 68;
        int num2 = 7;

        int count=0;

        while (num1 >= num2){
            num1 -= num2;

            count++;
        }
        System.out.println(count+ " with reminder is "+num1);

    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */